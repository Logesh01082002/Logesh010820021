//increasing triangle 
package excercise;

class Pattern1
{
	void pattern1()
	{
		int rows=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
	}
	
	//---------------------------------------------------
	// decreasing trianlge
	void pattern2()
	{
		int rows=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//--------------------------------------------------------
	//start print right increasing triangle
	void pattern3()
	{
		int rows=5;
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
			    System.out.print(" ");
			}
			   for(int j=1;j<=i;j++)
			    {
				System.out.print("*");
			    }
			System.out.println();
		}
	}
	//-------------------------------------------------------
	   //start print right decreasing triangle
    void pattern4()
	{
		int rows=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
	}

	//-----------------------------------------------------
	//   Left pascal triangle
	void pattern5()
	{
		//int rows=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//------------------------------------------------------
	//right pascal triangle
	void pattern6()
	{
	for(int i=1;i<=5;i++)
    {
    	for(int j=5;j>=i;j--)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++)
    	{
    	System.out.print("*");
    	}
   
    System.out.println();
    }
    for(int i=1;i<=5;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=5;k>=i;k--)
    	{
    	System.out.print("*");
    	}
   
    System.out.println();
    }
}
//-----------------------------------------------------------------
	// reverse of given number using operators
	void reverse1()
	{
		int number=12345;
		int reverse=0;                      
		while(number!=0)
		{
			int remainder=number%10;
			reverse=number*0+remainder;
			number=number/10;
			
			System.out.print(reverse);
		}
		
	}
//-------------------------------------------------------------------------
   //reverse of given number  for loop
	void reverse2()
	{
		
		int reverse=0;                      
		for(int number=67890;number!=0;number=number/10)
		{
			int remainder=number%10;
			reverse=reverse*0+remainder;
			
			System.out.print(reverse);
		}
	}
	

class Pattern
{
	public static void main(String[] args)
	{
		Pattern1 p=new Pattern1();
		Pattern1 r=new Pattern1();
		//p.pattern1();
		//p.pattern2();
		//p.pattern3();
		//p.pattern4();
		//p.pattern5();
		//p.pattern6();
		r.reverse1();
		  //r.reverse2();
	
	}
}
}





