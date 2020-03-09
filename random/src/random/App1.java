package random;
import java.util.*;

public class App1 
{
	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        int exit=1;
	        double principle_amt , interest_rate;
	        int time_period,times_interest_applied;
	        while(exit>0)
	        {
	        System.out.format("Enter the principle amount:\n");
	        principle_amt = sc.nextDouble();
	        System.out.format("Enter the rate of interest(in percentage): \n");
	        interest_rate = sc.nextDouble();
	        System.out.format("Enter the time period :\n");
	        time_period = sc.nextInt();
	        System.out.format("Enter the number of times interest is applied per time period:\n");
        	times_interest_applied=sc.nextInt();
	        Simple_Compound_Interest obj=new Simple_Compound_Interest(principle_amt,interest_rate,time_period,times_interest_applied);
	        System.out.format("What do you want to calculate?\n"
	        					+ "1.Simple Interest\n"
	        					+ "2.Compound Interest\n");
	        int choice=sc.nextInt();
	        switch(choice)
	        {
	        case 1:
	        	System.out.format("The Simple Interest calculated is:"+obj.getSimpleInterest()+"\n");
	        	break;
	        case 2:
	        	System.out.format("The Compound Interest calculated is:"+obj.getCompoundInterest()+"\n");
	        	break;
	        default:
	        	System.out.format("Invalid choice");
	        
	        }
	        System.out.format("Press 1 to continue.\n"
	        				   + "Press 0 to exit.");
	        exit=sc.nextInt();
	        
	        }
	        System.out.format("GoodBye!");
	        
	      sc.close();  
	    }
	

}
