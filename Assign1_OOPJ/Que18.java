import java.util.Scanner;
class Que18{
    public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);  
       System.out.println("Enter first number.");  
       int d1 = scanner.nextInt();  
      
       System.out.println("Enter second number");      
       int d2 = scanner.nextInt();  
              
       int d3= Integer.min(d1,d2);  
       int d6= Integer.max(d1,d2); 
       
       System.out.println("Enter third number");  
       int d4 = scanner.nextInt();  
           
       int d5= Integer.min(d3,d4);
       int d7= Integer.max(d6,d4);   
      
       System.out.println("The smaller number is: "+d5);  
       System.out.println("The bigger number is: "+d7); 
  
   }  
}