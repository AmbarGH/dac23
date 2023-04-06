import java.util.Scanner;
class Book{
    public String title;
    public String author;
    public String publisher;
    public String isbn;
    public int year;
    public double price;
    public int quantity;
    public Book()
    {
      this.title = " ";
      this.author = " ";
      this.publisher = " ";
      this.isbn = " ";
      this.year = 0;
      this.price = 0.0;
      this.quantity = 0;
    }
    public Book(String title, String author, String publisher, String isbn,
     int year, double price, int quantity)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getPublisher()
    {
        return this.publisher;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public String getIsbn()
    {
        return this.isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public int getYear()
    {
        return this.year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
class InventoryValue{
    Book b1 = new Book();
    public void increaseQuantity(int quantity){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity to be increased");
    int x = sc.nextInt();
    quantity += x;    
    b1.setQuantity(quantity);
   }
    public void decreaseQuantity(int quantity){
    Scanner sc = new Scanner(System.in);
    System.out.println("Value : " + b1.getQuantity());
    System.out.println("Enter the quantity to be decreased it should be less than value");
    int x = sc.nextInt();
    quantity-= x;  
    b1.setQuantity(quantity) ;           
   }
    public void getInventoryValue(){
    Scanner sc = new Scanner(System.in); 
    System.out.println("choose option :");
    System.out.println("1. Increase quantity of book");
    System.out.println("2. Decrease quantity of book");
    int num = sc.nextInt();

    switch(num){
    case 1: increaseQuantity(b1.getQuantity()); 
            double totalvalue1 = b1.getQuantity()*b1.getPrice();
            System.out.print(totalvalue1); break;
    case 2: decreaseQuantity(b1.getQuantity());
            double totalvalue2 = b1.getQuantity()*b1.getPrice();
            System.out.print(totalvalue2); break;
            }
        }
}
class Program3
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        Book bk = new Book();
        InventoryValue iv = new InventoryValue();
        /**System.out.println("Enter title of the book : ");
        bk.setTitle(sc.nextLine());
        System.out.println("Enter name of the author of the book : ");
        bk.setAuthor(sc.nextLine());
        System.out.println("Enter the name of the publisher of the book : ");
        bk.setPublisher(sc.nextLine());
        System.out.println("Enter the ISBN number of the book : ");
        bk.setIsbn(sc.nextLine());
        System.out.println("Enter the year in which the book was published : ");
        bk.setYear(sc.nextInt());*/
        System.out.println("Enter the price of the book : ");
        iv.b1.setPrice(sc.nextDouble());
        System.out.println("Enter the quantity of book : ");
        iv.b1.setQuantity(sc.nextInt());

        /**String title = bk.getTitle();
        String author = bk.getAuthor();
        String publisher = bk.getPublisher();
        String isbn = bk.getIsbn();
        int year = bk.getYear(); 
        double price = bk.getPrice();
        int quantity = bk.getQuantity();
        System.out.println("Title : "+title+" Author : "+author+" Publisher : "+publisher+" Isbn : "+isbn+
        " Year : "+year+" Price : "+price +" Quantity : "+quantity);*/
        iv.getInventoryValue();
        }
 }

