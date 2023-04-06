import java.util.*;

class bank_mgmt{
    String name;
	long acc_no;
	double acc_balance;
	
	public bank_mgmt(String name, Double acc_balance)
	{
		this.name = name;
		this.acc_balance = acc_balance;
		this.creat_new_acc();
	}
	
	public bank_mgmt() 
	{
		
	}

	void creat_new_acc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		this.name=sc.next();
		Random random = new Random();
		System.out.print("Enter the amount to deposit :");
		this.acc_balance=this.acc_balance+(sc.nextDouble());
		
		this.acc_no = 0;
        for(int i=0;i<12;i++)
        {
    	  this.acc_no=this.acc_no+(random.nextInt(9));
    	  this.acc_no=this.acc_no*10;
        }
         System.out.println("Your account number is +"+this.acc_no);
         System.out.println("Your Balance is "+this.acc_balance);
		
	}
	
	void deposit_money()
	{
		System.out.print("Enter your Account Number :");
		Scanner sc= new Scanner (System.in);
		long acc_no=sc.nextLong();
		
		if(this.acc_no==acc_no)
		{
			System.out.print("Enter the amount to deposit :");
			this.acc_balance=this.acc_balance+(sc.nextDouble());
		}
		
		else 
		{
		    System.out.println("Invalid Acc number");
		}
		
	}
	
	void withdraw_money() 
	{
		System.out.print("Enter your Account Number :");
		Scanner sc= new Scanner (System.in);
		long acc_no=sc.nextLong();
		
		if(this.acc_no==acc_no)
		{
		System.out.print("Enter the amount to withdraw :");
		this.acc_balance=this.acc_balance-(sc.nextDouble());
			
		}
		else 
		{
		 System.out.println("Invalid Acc number");
		}
		
	}
	void display_acc() 
	{
		System.out.print("Enter your Account Number :");
		Scanner sc= new Scanner (System.in);
		long acc_no=sc.nextLong();
		if(this.acc_no==acc_no)
		{
			System.out.println("The name oif the account holder is "+this.name);
			System.out.print("Account Number :"+this.acc_no);
			System.out.println("Account balance is "+this.acc_balance);
			
		}
		
		else 
		{
			
			System.out.println("Invalid Acc number");
		}
		
	}
	
	void acc_info() 
	{
		
		{
			System.out.print("Enter your Account Number :");
			Scanner sc= new Scanner (System.in);
			long acc_no=sc.nextLong();
			if(this.acc_no==acc_no)
			{
				System.out.println("The name oif the account holder is "+this.name);
				System.out.print("Account Number :"+this.acc_no);
				System.out.println("Account balance is "+this.acc_balance);
			}
			else
			{
				
				System.out.println("Invalid Acc number");
			}
			
		}
	}
	int show_menu()
	{
        Scanner sc= new Scanner (System.in);
        System.out.println(" 1.Create account \n2.deposit money \n3.withdraw money\n4.acc.info\n0.exit");
        return sc.nextInt();
        
    }
}

public class bank{
   
    public static void main(String[] args){
        bank_mgmt bank1= new bank_mgmt();
	
		int choice;
		
		while( ( choice = bank1.show_menu( ) ) != 0 )
        {
            switch(choice)
            {   case 1:
       
                bank1.creat_new_acc();
                break;
                case 2:bank1.deposit_money();
                break;
                case 3:bank1.withdraw_money();
                break;
                case 4:bank1.acc_info();
                break;
              
            }
		
	    }
        
    }
    
}