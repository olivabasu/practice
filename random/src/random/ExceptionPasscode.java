package random;
import java.util.*;
/*class MyException extends Exception
{
	String s;
	MyException(String str)
	{
		s=str;
	}
	public String getMessage()
	{
		return s;
	}
}*/

public class ExceptionPasscode {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			try
			{
				int y=7;
				System.out.println("Enter the limit.");
				int x=sc.nextInt();
				if(!(x<=y))
					throw new /*My*/Exception("Limit greater than 7.");
				System.out.println("Enter the passcode");
				String passcode=sc.next();
				if(passcode.length()!=x)
					throw new /*My*/Exception("String length not within limits");
				String s="AKMSIQWVP";
				for(int i=0;i<passcode.length();i++)
				{
				 char ch=passcode.charAt(i);
				 if(!(ch>=65  && ch<=90 ))
						throw new /*My*/Exception("There are characters in your passcode which are not in uppercase.");
 				 else if((s.indexOf(ch)==-1))
					throw new /*My*/Exception("There are characters in passcode which are not allowed.");
				 else if(passcode.indexOf(passcode.charAt(i),i+1)!=-1)
							throw new /*My*/Exception("There are repeatations in your passcode.");
				
				}
				System.out.println("Code is valid.");
				break;
			}
			catch(/*My*/Exception e)
			{
				System.out.println(e.getMessage());
				continue;
			}
			//catch(InputMismatchException e1) {
				//System.out.println("nbasgdhjg");
			}
			
		}
	}


			
			
				
					
						
					