import java.io.*;
import java.util.*;
public class SignUp{
    public static Scanner sc=new Scanner(System.in);
    //String id=s.next();
    public static void write(String id,File fi)throws IOException{//creating a method to write the data to file
        FileWriter fw=new FileWriter(fi,true);
        fw.write(id);
        fw.close();
    }
    public static String[] readFiles(String file){// converting the data of the file into array and storing 
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            System.out.println("Enter the Username:");
            String uname=sc.next();
            //System.out.print(uname);
            for(int i=0;i<arr.length;i++){
                //System.out.println(arr[i]);
                if(uname.equals(arr[i])){//making sure the username is not repeated
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==1){
                System.out.println("The user already exists");
            }
            else{
                int i;
                String x;
                i=arr.length;
                File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\username.txt");
                write(uname +"\n",fi);
                String [] data1=readFile("password.txt");//if the user is new then he need to create a password
                //System.out.println("The data has been appended succesfully");
                arr[i]=s1.nextLine();

            }
            return arr;
        }
        catch(Exception e){
            return null;
        }
    }
    public static Scanner sca=new Scanner(System.in);
    //String id=s.next();
    public static void writes(String id,File fi)throws IOException{
        FileWriter fw=new FileWriter(fi,true);
        fw.write(id);
        fw.close();
    }
    public static String[] readFile(String file){
        try{
            File f =new File(file);
            Scanner s=new Scanner(f);
            int c=0;
            int flag=0;
            while(s.hasNextLine()){
                c++;
                s.nextLine();
            }
            String[] arr=new String[c];
            Scanner s1=new Scanner(f);
            /*for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }*/
            System.out.println("Enter the Password:");
            String pass=sca.next();
            //System.out.println(uname);
            File fi=new File("C:\\Users\\USER\\Desktop\\tanmayee\\password.txt");
            write(pass +"\n",fi);
            System.out.println("The aacount has been created");
            for(int i=0;i<arr.length;i++){
                arr[i]=s1.nextLine();
            }
            return arr;
        }
        catch(Exception e){
            return null;
        }
    }
    public static void main(String [] args){
        try{
            String [] data=readFiles("username.txt");
           // System.out.println(Arrays.toString(data));
            //String [] data1=readFile("password.txt");
            //System.out.println(Arrays.toString(data));
        }
        finally{

        }
    }    
}