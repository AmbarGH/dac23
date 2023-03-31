import java.util.Scanner;
class Que26{
    public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);  
       System.out.println("Enter first number.");  
       Float f1 = scanner.nextFloat();  
      
       System.out.println("Enter second number");      
       Float f2 = scanner.nextFloat();  
              
       Float f3= Float.min(f1,f2);  
       Float f6= Float.max(f1,f2); 
       
       System.out.println("Enter third number");  
       Float f4 = scanner.nextFloat();  
           
       Float f5= Float.min(f3,f4);
       Float f7= Float.max(f6,f4);   
      
       System.out.println("The smaller number is: "+f5);  
       System.out.println("The bigger number is: "+f7); 
  
   }  
}