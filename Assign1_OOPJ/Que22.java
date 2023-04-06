import java.util.Scanner;
class Que22{
    public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);  
       System.out.println("Enter first number.");  
       Long f1 = scanner.nextLong();  
      
       System.out.println("Enter second number");      
       Long f2 = scanner.nextLong();  
              
       Long f3= Long.min(f1,f2);  
       Long f6= Long.max(f1,f2); 
       
       System.out.println("Enter third number");  
       Long f4 = scanner.nextLong();  
           
       Long f5= Long.min(f3,f4);
       Long f7= Long.max(f6,f4);   
      
       System.out.println("The smaller number is: "+f5);  
       System.out.println("The bigger number is: "+f7); 
  
   }  
}