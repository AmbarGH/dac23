class Hollowinverted{
	public static void main(String args[])
	{
	   for(int i=1;i<=5;i++)
	   {
		  for(int j=5;j>=i;j--)
		 {	
		    if(j==5)
             System.out.print("* ");
	     
		    else if(i==j)
             System.out.print("* ");
	     
		    else if(i==1)
             System.out.print("* ");
		    else
		     System.out.print("  ");
	     }	
		  System.out.println();
	    }
	}	
}