import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
              char c;
                 
              Scanner s=new Scanner(System.in);
              System.out.println("Enter a character:");
              c=s.next().charAt(0);
             
             if(c>='a' && c<='z' || c>='A' && c<='Z')
             System.out.println("The entered value is an alphabet");

             else
            System.out.println("The value is not an alphabet");                

             
	}
}