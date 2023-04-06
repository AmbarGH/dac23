import java.util.Scanner;
class tollcalc{
    String vehicletype;
    int numaxles;
    double disttravelled;
    double tollfee;
    double totalamtdue;
   
    tollcalc(){

    }
    public tollcalc(String vehicletype, int numaxles, double disttravelled, double tollfee,double totalamtdue) 
    {
        this.vehicletype = vehicletype;
        this.numaxles = numaxles;
        this.disttravelled = disttravelled;
        this.tollfee = tollfee;
        this.totalamtdue = totalamtdue;
    }

    void calculatetoll(String vehicletype,int numaxles){
        if(vehicletype.equalsIgnoreCase("car")||vehicletype.equalsIgnoreCase("van")||vehicletype.equalsIgnoreCase("bus"))
        {
            this.tollfee=(this.disttravelled*this.numaxles*0.25);
            this.totalamtdue=2+this.tollfee;

        }
        else if(vehicletype.equalsIgnoreCase("truck"))
        {
            this.tollfee= (this.disttravelled*this.numaxles*0.50);
        }

    }
    void generatebill(){
        System.out.println(" vehicle type    : "+this.vehicletype);
        System.out.println(" number of axles : "+this.numaxles);
        System.out.println(" Distance        : "+this.disttravelled);
        System.out.println(" Toll Fee        : "+this.tollfee);
        System.out.println(" processing fee  : "+2);
        System.out.println(" Total Amt Due   : "+this.totalamtdue);

    }
    int showmenu(){
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter the details:\n1. Enter vehicle type (car, van, bus, or truck)\n2. Enter number of axles\n3. Enter distance travelled\n4. Calculate toll fee\n5. Generate bill\n6. Exit");
        return sc.nextInt();
        
    }

}
public class Toll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        tollcalc t1= new tollcalc();
        int choice;
        while( ( choice = t1.showmenu( ) ) != 0 )
        {
            switch(choice)
            {   case 1:System.out.print("Enter vehicle type (car, van, bus, or truck) :");
                t1.vehicletype=sc.next();
                break;
                case 2:System.out.print("Enter number of axles :");
                t1.numaxles=sc.nextInt();  
                break;
                case 3:System.out.print("Enter distance travelled :");
                t1.disttravelled=sc.nextDouble();
                case 4:System.out.print("Calculate toll fee :");
                t1.calculatetoll(t1.vehicletype, t1.numaxles);
                case 5:System.out.print("Generate bill1 :");
                t1.generatebill();
            }

        }
        
    }
    
}
