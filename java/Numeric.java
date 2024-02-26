//-------------Decimal to binary conversion------------
package excercise;
import java.util.Scanner;
class Numeric1
{	
void numeric()
   {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal : ");
		int dec = sc.nextInt();
		
		String bin = Integer.toBinaryString(dec);
		System.out.println("the binary number is :"+ bin);
	}
//-----------Decimal to binary conversion normal method-------------

void numeric2()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the decimal : ");
	int dec = sc.nextInt();
	String binary = " ";
	
	while(dec>0)
	{
		int rem = dec % 2;
		binary= rem + binary;
		dec = dec/2;
	}
	System.out.println(binary);
}
//-------------binary to decimal conversion--------------------------------

void binary()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the binary digits : ");
	int bin = sc.nextInt();
	double dec=0;
	int i=0;
	
	while(bin>0)
	{ 
	int rem = bin % 10;
	dec = dec+(rem*Math.pow(2,i));
	bin = bin/10;
	i++;
	}
	System.out.println("the decimal is : "+dec);
}
//-----------------LCM of 2 numbers using if--------------------
 
void lcdofnumber()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number1 : ");
    int num1 = sc.nextInt();
    System.out.println("enter the number2 : ");
    int num2 = sc.nextInt();
    int hcf = 1;
    
    for(int i=1;i<=num1|| i<=num2;i++)
    {
    	if(num1%i ==0 && num2 %i ==0)
    	{
    		hcf=1;
    	}
    }
    int lcm= num1*num2/hcf;
    System.out.println("LCM of given number is "+lcm);
}
//-----------------GCD of given number using forloop -------------------------

void gcdnumber()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1 : ");
	int num1=sc.nextInt();
	System.out.println("enter the number2 : ");
	int num2=sc.nextInt();
    int i=1;
    int gcd=1;
    
    for(i=1;i<=num1 && i<=num2;i++)
    {
    	if(num1%i==0 && num2%i==0)
    		gcd=i;
    }
    System.out.println(gcd);
}
//----------------GCD of given number using whileloop ---------------------------

void gcd2()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1. : ");
	int num1=sc.nextInt();
	System.out.println("enter the number2 : ");
	int num2=sc.nextInt();
	
	while(num1 !=num2)
	{
		if(num1>num2)
		{
			num1=num1-num2;
		}
		else
			num2=num2-num1;
	}
	System.out.println(num2);	
}
//--------------swap of two variable-------------------

void swap2()
{
	int a=5;
	int b=6;
	
	a=a+b;   //11
	b=a-b;   //5
	a=a-b;
    
	System.out.println("swapping of a "+a+"b is "+b) ;
	
}
//-------------swap of 3 variables-------------------

void swap3()
{
	int a,b,c;
	a= 10;
	b=20;
	c=50;
	
	a=a+b+c;

	b=a-(b+c);
	c=a-(b+c);
	a=a-(b+c);
	
	System.out.println("swap  of number a is "+a+" b is "+b+" c is "+c);
}

}
public class Numeric 
{
	public static void main(String[] args) 
	{
		Numeric1 n=new Numeric1();
		//n.numeric();
		//n.numeric2();
		//n.binary();
		//n.lcdofnumber();
		//n.gcdnumber();
		//n.gcd2();
		//n.swap2();
		n.swap3();
		
	}

}