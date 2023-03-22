class Pyramid5{
	public static void main(String args[])
	{
	   for(int i=9;i>=1;i--)
	   {
		  for(int j=1;j<i;j++)
		 {	
           System.out.print("  ");
	     }	
		  for(int k=i;k<=9;k++)
		 {	
           System.out.print(k+" ");
	     }	
	     for(int k1=8;k1>=i;k1--)
		 {	
           System.out.print(k1+" ");
	     }	
		 System.out.println();
	    }
	}	
}