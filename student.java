import java.util.Scanner;
class Stud_details{

       
              
              int marks[]=new int[3];
              int credits[]=new int[3];
              String usn,name;
      
                Scanner sc = new Scanner(System.in);


                void getdetails()
                {
                  usn=sc.next();
                  name=sc.next();
                  for(int i=0;i<3;i++)
                  {
                     marks[i]=sc.nextInt();
                     credits[i]=sc.nextInt();
                  }
               }
                 
                  void display()
               {
                     System.out.println("usn"+" "+usn);
                     System.out.println("name"+" "+name);
                    for(int i=0;i<3;i++)
                   {
                     System.out.println("marks and credits of 3 subjects"+" "+marks[i]+" "+credits[i]);
        
                    }
           }

           int sgpa(){
                     int c=0;
                     int result=0;
                     int total=0;
                  for(int i=0; i<3; i++){
                           int grade;
                           

                           if(marks[i]>=90 && marks[i]<=100){
                            grade=10;}
                           else if(marks[i]>=80 && marks[i]<89){ 
                            grade=9;}
                           else if(marks[i]>=70 && marks[i]<79){
                            grade=8;}
                           else if(marks[i]>=60 && marks[i]<69) {
                            grade=7;}
                           else if(marks[i]>=55 && marks[i]<59){ 
                            grade=6;}
                           else if(marks[i]>=50 && marks[i]<54){ 
                            grade=5;}
                           else if(marks[i]>=40 && marks[i]<49) {
                             grade=4;}
                           else{ 
                                grade=0;}
                           
                           total=total+credits[i]*grade;
                           c=c+credits[i];
                           
           }
result=total/c;
return result;}
                           
 }

 class Student{
                 public static void main(String args[])
            {
               Stud_details s1[]=new Stud_details[3];

               for(int j=0;j<3;j++)
              {
                 s1[j]=new Stud_details();
               }

                    for(int j=0;j<3;j++)
                  {
                    System.out.println("Enter the usn, name, marks and credits of"+(j+1)+" "+"student details");
                    s1[j].getdetails();
                 }
 

              for(int j=0;j<3;j++)
              {
                 s1[j].display();
                 int n;
                 n=s1[j].sgpa();
                 System.out.println("The sgpa is:"+n);
               }
             
      }
 }
         
 















              

              
