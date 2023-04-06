import java.util.Scanner;
class rationalnumcalc{
    int numerator1;
    int denominator1;
    int numerator2;
    int denominator2;
    int ansnumerator;
    int ansdenominator;
    int lcm;
    public rationalnumcalc(int numerator1, int denominator1, int numerator2, int denominator2) {
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;
        this.numerator2 = numerator2;
        this.denominator2 = denominator2;
    }
    public rationalnumcalc(){

    }
    void print(){
        System.out.println(this.numerator1+" / "+this.denominator1);
        System.out.println(this.numerator2+" / "+this.denominator2);
        System.out.println(this.ansnumerator+" / "+this.ansdenominator);

    }
    void addition(){
        if (this.denominator1==this.denominator2)
        {
            this.ansnumerator=this.numerator1+this.numerator2;
            this.ansdenominator=this.denominator1;
        }
        else {
            this.findlcm(denominator1, denominator2);
            this.numerator1=this.numerator1*(this.lcm/this.denominator1);
            this.numerator2=this.numerator2*(this.lcm/this.denominator2);
            this.ansnumerator=this.numerator1+this.numerator2;
            this.ansdenominator=this.lcm;
            for(int i=this.ansdenominator;i>30;i--)
            {
                if(this.ansdenominator%i==0&&this.ansnumerator%i==0)
                 {
                    this.ansdenominator=this.ansdenominator/i;
                    this.ansnumerator=this.ansnumerator/i;
                 }
            }
        }

    }
    void subtraction(){
        if (this.denominator1==this.denominator2)
        {
            this.ansnumerator=this.numerator1-this.numerator2;
            this.ansdenominator=this.denominator1;
        }
        else {
            this.findlcm(denominator1, denominator2);
            this.numerator1=this.numerator1*(this.lcm/this.denominator1);
            this.numerator2=this.numerator2*(this.lcm/this.denominator2);
            this.ansnumerator=this.numerator1-this.numerator2;
            this.ansdenominator=this.lcm;
            for(int i=this.ansdenominator;i>0;i--)
            {
                if(this.ansdenominator%i==0&&this.ansnumerator%i==0)
                 {
                    this.ansdenominator=this.ansdenominator/i;
                    this.ansnumerator=this.ansnumerator/i;
                 }
            }
        }
    }
    void multiplication(){
        this.ansnumerator=this.numerator1*this.numerator2;
        this.ansdenominator=this.denominator1*this.denominator2;
        for(int i=this.ansdenominator;i>0;i--)
            {
                if(this.ansdenominator%i==0&&this.ansnumerator%i==0)
                 {
                    this.ansdenominator=this.ansdenominator/i;
                    this.ansnumerator=this.ansnumerator/i;
                 }
            }


    }
    void division(){
        this.ansnumerator=this.numerator1*denominator2;
        this.ansdenominator=this.numerator2*denominator1;
        for(int i=this.ansdenominator;i>0;i--)
            {
                if(this.ansdenominator%i==0&&this.ansnumerator%i==0)
                 {
                    this.ansdenominator=this.ansdenominator/i;
                    this.ansnumerator=this.ansnumerator/i;
                 }
            }

    }
    void findlcm(int a, int b){
        this.lcm= (a*b)/findgcd(a,b);

    }
    int findgcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return findgcd(b,a%b);

        }

   
    }
    



}
public class rationalnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number");
        System.out.print("Numerator :");
        int num1=sc.nextInt();
        System.out.print("denominator :");
        int den1=sc.nextInt();
        System.out.println("Enter second number");
        System.out.print("Numerator :");
        int num2=sc.nextInt();
        System.out.print("denominator :");
        int den2=sc.nextInt();
        rationalnumcalc obj= new rationalnumcalc(num1,den1,num2,den2);

        System.out.println("Enter your choice \n1.addition \n2.subtraction \n3.multiplication \n4.division");
        switch (sc.nextInt())
        {
            case 1:{obj.addition();
            
            obj.print();
            }             
            break;
            case 2:{ obj.subtraction();
            obj.print();
            }
                break;
            case 3:{obj.multiplication();
            obj.print();
            }
                break;
            case 4:{obj.division();
            obj.print();
                }    
                break;
        }
    }
}
