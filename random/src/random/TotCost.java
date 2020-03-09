package random;
import java.util.*;

public class TotCost 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.format("Enter the total area of the house (in square feet).\n");
	int area=sc.nextInt();
	System.out.format("What is the customer's preference?\n"
						+ "1.Use standard materials. (12000INR)\n"
						+ "2.Use above standard materials. (15000INR)\n"
						+ "3.High standard materials.(18000INR)\n"
						+ "4.High standard materials with fully automated home.(25000INR)\n");
	
	int choice=sc.nextInt();
	Construction obj=new Construction(choice,area);
	int result=obj.ConstructionCost();
	if(result==0) {
		System.out.format("Invalid choice.\n");
		System.exit(0); }
	else
		System.out.format("The total construction cost is : "+result+"INR");
	
	sc.close();
    }
}

	




