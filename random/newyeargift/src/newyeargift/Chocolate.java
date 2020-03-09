package newyeargift;

public class Chocolate implements NewYearGift
{
	int chocwt,chocpr;
	public Chocolate(int weight,int price)
	{
		this.chocwt=weight;
		this.chocpr=price;
	}
	public int getWeight()
	{
		return chocwt;
	}
	public int getPrice()
	{
		return chocpr;
	}
	

}
