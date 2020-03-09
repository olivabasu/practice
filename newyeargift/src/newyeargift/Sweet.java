package newyeargift;

public class Sweet implements NewYearGift
{
	int sweetwt,sweetpr;
	public Sweet(int weight,int price)
	{
		this.sweetwt=weight;
		this.sweetpr=price;
	}

	
	public int getWeight()
	{
		return sweetwt;
	}

	
	public int getPrice() 
	{
		return sweetpr;
	}
	

}
