package newyeargift;

import java.util.*;

public class GiftAnalysis 
{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Chocolate> chocolates=new ArrayList<Chocolate>();
	static ArrayList<Chocolate> candies=new ArrayList<Chocolate>();
	static ArrayList<Sweet> sweets=new ArrayList<Sweet>();
	static HashMap<String,Integer> nameToWeight= new HashMap<String,Integer>();
	static HashMap<String,Integer> nameToPrice= new HashMap<String,Integer>();
	public static void main(String[] args) 
	{
		inputChocolates();
		
		inputSweets();
		
		System.out.println("Total weight of your gift is-"+totalWeight());
		System.out.println("How do you want to sort? 1->By Price 2->By weight");
		int sortmet=sc.nextInt();
		if(sortmet==1)
		{
			Comparator<Chocolate> compareByPrice=(Chocolate c1,Chocolate c2) -> ((Integer) c1.getPrice()).compareTo(c2.getPrice());
			
			Collections.sort(chocolates,compareByPrice);
			System.out.println("Chocolate prices after sorting are-");
			for(Chocolate choco:chocolates)
			{
				System.out.println(choco.getPrice());
			}
											

		}
		else
		{

			Comparator<Chocolate> compareByWeight=(Chocolate c1,Chocolate c2) -> ((Integer) c1.getWeight()).compareTo(c2.getWeight());
			
			Collections.sort(chocolates,compareByWeight);
			System.out.println("Chocolate weights after sorting are-");
			for(Chocolate choco:chocolates)
			{
				System.out.println(choco.getWeight());
			}
											
		}
		
		myRange(sortmet);
		
	}
	public static void inputChocolates()
	{
		System.out.println("Enter the number of chocolates\n");
		int chocnum=sc.nextInt();
		for(int i=1;i<=chocnum;i++)
		{
			System.out.println("Enter chocolate type: 1->Candy 2->Wafer");
			int choctype=sc.nextInt();
			System.out.println("Enter chocolate weight");
			int chocwt=sc.nextInt();
			System.out.println("Enter chocolate price");
			int chocpr=sc.nextInt();
			if(choctype==1)
			{
				System.out.println("Enter name of candy\n");
				String candyname=sc.next();
				if(nameToWeight.containsKey(candyname))
				{
					nameToWeight.put(candyname,(int)nameToWeight.get(candyname)+chocwt);
				}
				else
					nameToWeight.put(candyname, chocwt);
					
				if(nameToPrice.containsKey(candyname))
				{
						nameToPrice.put(candyname,(int)nameToPrice.get(candyname)+chocpr);
				}
				else
					nameToPrice.put(candyname, chocpr);
				
			}
			Chocolate choco=new Chocolate(chocwt,chocpr);
			chocolates.add(choco);
			if(choctype==1)
				candies.add(choco);
		}
	}
	
	public static void inputSweets()
	{
		System.out.println("Enter the number of sweets\n");
		int sweetnum=sc.nextInt();
		for(int s=1;s<=sweetnum;s++)
		{
			System.out.println("Enter chocolate type: 1->Kaju Katli 2->GulabJamun");
			int sweetype=sc.nextInt();
			System.out.println("Enter sweet weight");
			int sweetwt=sc.nextInt();
			System.out.println("Enter sweet price");
			int sweetpr=sc.nextInt();
			Sweet sweet=new Sweet(sweetwt,sweetpr);
			sweets.add(sweet);
		
		}
	}
	
	public static int totalWeight()
	{
		int totalwt=0;
		for(Chocolate choco:chocolates)
		{
			totalwt+=choco.getWeight();
			
		}
		
		for(Sweet sweet:sweets)
		{
			totalwt+=sweet.getWeight();
		}
		return totalwt;
	}
	
	public static void myRange(int sortmet)
	{
		System.out.println("What is your range?");
		int beg,end;
		if(sortmet==1)
		{
			System.out.println("Enter start of price range");
			 beg=sc.nextInt();
			System.out.println("Enter end of price range");
			end=sc.nextInt();
			
			Set<Map.Entry<String,Integer>> candyset=nameToPrice.entrySet();
			Iterator<Map.Entry<String,Integer>> candytrav=candyset.iterator();
			while(candytrav.hasNext())
			{
				Map.Entry candyElement= (Map.Entry)candytrav.next();
				int candyprice=(int)candyElement.getValue();
				if(candyprice>= beg && candyprice<=end)
					System.out.println(candyElement.getKey());
			}
		}
		else
		{
			System.out.println("Enter start of weight range");
			beg=sc.nextInt();
			System.out.println("Enter end of weight range");
			end=sc.nextInt();
			
			Set<Map.Entry<String,Integer>> candyset=nameToWeight.entrySet();
			Iterator<Map.Entry<String,Integer>> candytrav=candyset.iterator();
			while(candytrav.hasNext())
			{
				Map.Entry candyElement= (Map.Entry)candytrav.next();
				int candyweight=(int)candyElement.getValue();
				if(candyweight>= beg && candyweight<=end)
					System.out.println(candyElement.getKey());
			}
		}
		
	}
	
}





