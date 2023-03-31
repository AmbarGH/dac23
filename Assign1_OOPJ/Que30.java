import java.util.Scanner;
class Que30{
    public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);  
       System.out.println("Enter first number.");  
       Double d1 = scanner.nextDouble();  
      
       System.out.println("Enter second number");      
       Double d2 = scanner.nextDouble();  
              
       Double d3= Double.min(d1,d2);  
       Double d6= Double.max(d1,d2); 
       
       System.out.println("Enter third number");  
       Double d4 = scanner.nextDouble();  
           
       Double d5= Double.min(d3,d4);
       Double d7= Double.max(d6,d4);   
      
       System.out.println("The smaller number is: "+d5);  
       System.out.println("The bigger number is: "+d7); 
  
   }  
}