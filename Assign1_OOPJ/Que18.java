import java.util.Scanner;
class Que18{
    public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);  
       System.out.println("Enter first number.");  
       Int d1 = scanner.nextInt();  
      
       System.out.println("Enter second number");      
       Int d2 = scanner.nextInt();  
              
       Int d3= Int.min(d1,d2);  
       Int d6= Int.max(d1,d2); 
       
       System.out.println("Enter third number");  
       Int d4 = scanner.nextInt();  
           
       Int d5= Int.min(d3,d4);
       Int d7= Int.max(d6,d4);   
      
       System.out.println("The smaller number is: "+d5);  
       System.out.println("The bigger number is: "+d7); 
  
   }  
}