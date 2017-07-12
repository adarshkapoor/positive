import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    int i;
    
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a year");
	i=s.nextInt();
	
	if(i%4==0)
	System.out.println("It is a leap year");
	
	else
	System.out.println("It is not a leap year");
	
	}
}