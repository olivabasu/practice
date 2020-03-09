package random;

import java.util.*;

public class Stringer
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1="hrly wging ";
		for(int i=0;i<s1.length()-3;i++)
			{
				if((s1.substring(i,i+3).equalsIgnoreCase("ing")))
					 {
						s1=((s1.substring(0,i)+"ly"+s1.substring(i+3)));
						for(int j=i+3;j<s1.length();j++)
						{
							if((s1.substring(j,j+2).equalsIgnoreCase("ly")))
								{s1=((s1.substring(0,j)+"ing"+s1.substring(j+2)));
								System.out.println(s1);}
						}
						
					 }
				else if((s1.substring(i,i+2).equalsIgnoreCase("ly")))
				 {
					s1=((s1.substring(0,i)+"ing"+s1.substring(i+2)));
					for(int j=i+2;j<s1.length();j++)
					{
						if((s1.substring(j,j+3).equalsIgnoreCase("ing")))
							{s1=((s1.substring(0,j)+"ly"+s1.substring(j+3)));
							System.out.println(s1);}
					}
					
				 }
			}
            
	}
	
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
	


