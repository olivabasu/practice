package random;

public class Weight 
{
	public static void main(String args[])
	{
		String s="abccddde";
		int n=s.length();
		int arr[]=new int[n];
		int ans=0;
		for(char ch='a';ch<='z';ch++)
		{
			ans=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					ans=ans+((int)ch-96);
					
					
				}
				
			}
			
		}
		
	}

}
