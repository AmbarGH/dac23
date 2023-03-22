class Pyramid4{
	public static void main(String args[])
	{
	    int num=9;
	   for(int i=1;i<=num;i++)
	   {
		  for(int j=num;j>=i;j--)
		 {	
           System.out.print("  ");
	     }	
		  for(int k=1;k<=i;k++)
		 {	
           System.out.print(k+" ");
	     }	
	     for(int k1=i-1;k1>=1;k1--)
		 {	
           System.out.print(k1+" ");
	     }	
		 System.out.println();
	    }
	}	
}