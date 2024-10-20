import java.util.Scanner;

class Book{
          String name, author;
          int price;
          int num_pages;
          Scanner sc=new Scanner(System.in);
         
         
         
         public Book(String name1, String author1, int price1, int num_pages1)
         {
            name=name1;
            author=author1;
            price=price1;
            num_pages=num_pages1;
         }
     
         void get_details()
         {
             System.out.println("Enter your name:");
             name=sc.next();
             System.out.println("Enter the author name:");
             author=sc.next();
             System.out.println("Enter the price:");
             price=sc.nextInt();
             System.out.println("Enter the number of pages:");
             num_pages=sc.nextInt();
             System.out.println("The details are successfully entered.");
         }
         void Display()
         {
             System.out.println("Name : "+name);
             System.out.println("Author : "+author);
             System.out.println("Price : "+price);
             System.out.println("number of pages : "+num_pages);
         }
          public String toString() {
        return "Book{name='" + name + "', author='" + author + "', price=" + price + ", num_pages=" + num_pages + "}";
    }
         
         }
class BookProgram{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
          //Book obj1=new Book("Nidhi", "anne", 1250, 540);
          //obj1.to_String();


          int n;
         System.out.println("Enter the number of entries to be made : ");
         n=sc.nextInt();
         String name, author;
         int price, num_pages;
         Book Details[]=new Book[n];
         for(int i=0; i<n; i++)
         {   System.out.println("Enter your name:");
             name=sc.next();
             System.out.println("Enter the author name:");
             author=sc.next();
             System.out.println("Enter the price:");
             price=sc.nextInt();
             System.out.println("Enter the number of pages:");
             num_pages=sc.nextInt();
             System.out.println("The details are successfully entered.");
             
             Details[i] = new Book(name, author, price, num_pages);
         }
         

         System.out.println(" ");
         for(int j=0; j<n; j++)
          {  
             System.out.println("The details are:");
             //Details[j].Display();
              System.out.println(Details[j].toString());
          }
sc.close();
         
}
}