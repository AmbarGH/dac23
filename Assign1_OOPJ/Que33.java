
class Que33
{
    public static void main(String args[])
    {
    int num1=Integer.parseInt(args[0]);
    float num2=Float.parseFloat(args[1]);
    double num3=Double.parseDouble(args[2]);
    int choice= Integer.parseInt(args[3]);
      switch (choice) 
      {
     case 1:
            System.out.println("Addition = "+((double)num1+(double)num2+(double)num3));
            break;

     case 2:
            System.out.println("Subtraction = "+((double)num1-(double)num2-(double)num3));
            break;

    case 3:
            System.out.println("Multiplication = "+((double)num1*(double)num2*(double)num3));
            break;

     case 4:
            System.out.println("Division = "+(((double)num1/(double)num2)/(double)num3));
            break;
      
        default:
            break;
      }
    }
}

