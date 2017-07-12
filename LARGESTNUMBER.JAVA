import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int x1,x2,x3;
		int large;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x1");
		x1=s.nextInt();
		
		System.out.println("Enter the value of x2");
		x2=s.nextInt();
		
		System.out.println("Enter the value of x3:");
		x3=s.nextInt();
		
		large=x1;
		
		
		if(large<x2)
		large=x2;
		
		if(large<x3)
		large=x3;
		
		System.out.println("\n\n\tlargest numer="+large);
	}
}