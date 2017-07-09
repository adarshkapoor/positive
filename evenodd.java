import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
       
       System.out.print("Enter a number:");
       int a=s.nextInt(); 
           
        { if(a%2==0)
           System.out.println("the number is even");
            
             else 
            System.out.println("the number is odd" );
           }
	}
}