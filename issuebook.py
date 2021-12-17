
bookname=input("enter the book name:")
rollno=input("enter the roll number:")
f=open("file1.txt",'r')#contains all the names of the book
p=open("file2.txt",'r')#contains the count of each book
d=open("file3.txt",'a')
list=f.read().split('\n')
#print(list)#splitting the list by the new line
list2=p.read().split('\n')
#print(list2)#splitting the list by the new line
while('' in list2):
    list2.remove('')#for the first execution it works fine but for the second execution  an empty string will be in the list inorder to remove we use this
#print(list2)

if bookname  in list :
    y=bookname#storing the book name in the variable y
    index=list.index(y)
    #print(index)
    x=(list2[index])#accesing the count of books from the list2 i.e the count of each group
    #print(x)
    if(int(x)>0):
        print("the book  can be issued")
        x=int(x)-1#if the book is issued then we need to decrease the count of book 
        print(" the book has been issued to \t" + rollno)
        d=open("file3.txt",'a')
        d.write("\nthe" +" "+bookname+" " + "has been issued to "+ rollno+"\n")#storing the data into the file
        print("The remaining books left is ",str(x))
        list2[index]=str(x)
        #print(list2)
        l=open("file2.txt",'w')
        for items in list2:
            l.write(items+"\n")#after the count has been decreased then changing the count in the list
        l.close()
        if(int(x)==0):
            print("the book stock has been completed")
    else:
        print("stock has been completed")
    
else :
    print("book is not available")