import java.time.LocalDate;
import java.util.Scanner;

class Time{
     Scanner sc = new Scanner(System.in);
       {
        System.out.print("hour  : ");
        }
         int hour = sc.nextInt();
       {
        System.out.print("Minutes : ");
       }
         int minutes = sc.nextInt();
       {
        System.out.print("Seconds  : ");
       }
         int seconds = sc.nextInt();

void currTime(){
    if ( hour > 24 &&  minutes > 59 && seconds > 59){
         System.out.println("Wrong input");
    }
    else{
     System.out.println(hour+":"+minutes+":"+seconds);
     System.out.println(hour+":"+minutes);
    }
  }

}


class Timeformat{
    public static void main(String args[]){
         Time t1=new Time();
         t1.currTime();
    }
}