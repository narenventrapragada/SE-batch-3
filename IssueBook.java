import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IssueBook {
    public static boolean verify= false;
    public static Scanner sc = new Scanner(System.in);

    // String id=s.next();
    public static void write(String id, File fi) throws IOException {// creating a method to write the data to file
        FileWriter fw = new FileWriter(fi, true);
        fw.write(id);
        fw.close();
    }

    public static String[] readFiles(String file) {// converting the data of the file into array and storing
        try {
            File f = new File(file);
            Scanner s = new Scanner(f);
            int c = 0;
            int flag = 0;
            while (s.hasNextLine()) {
                c++;
                s.nextLine();
            }
            String[] arr = new String[c];
            Scanner s1 = new Scanner(f);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s1.nextLine();
                
                //System.out.println(arr[i]);
            }
            
            System.out.println("Enter the bookname:");
            String bname = sc.nextLine();
            
             //System.out.print(bname);
            for (int i = 0; i < arr.length; i++) {
                //System.out.println(arr[i]);
                if (bname.equalsIgnoreCase(arr[i])) {// making sure the username is not repeated
                    int index=0;
                    index=i;
                    verify=true;
                   // System.out.println("index is "+""+i);
                   /* while(i!=-1)
                    { 
                        int[] indices
                        int index1=-1;


                    }
                 */
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }
            }
            
            
            if (flag == 1) {
                int count=0;
                System.out.println("The book is available");
                
                     try {
                           File file1 = new File("books.txt");
                           FileWriter store = new FileWriter(file1,true);
                           PrintWriter pw = new PrintWriter(store);
                           pw.println(count+" "+bname+"is issued");
                           count++;
                           System.out.println(count+" "+"book has been issued");
                           pw.close();
                           
                           
                     }catch (IOException e) {
                           System.out.println("An error occurred.");
                            e.printStackTrace();
                    }
            }

              
             else {
                System.out.println("The book is not available");

            }
            return arr;
        }catch(

    Exception e)
    {
        return null;
    }
    }

    public static void main(String[] args) {
        String[] data = readFiles("bookname.txt");
    }
}
