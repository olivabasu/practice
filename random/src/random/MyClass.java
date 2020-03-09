package random;
import java.util.*;

public class MyClass {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
    ArrayList<Book> ob1=new ArrayList<Book>();
    Book b1=new Book("a",20);
    Book b2=new Book("b",30);
    ob1.add(b1);
    ob1.add(b2);
   for(Book j: ob1)
    {
    	System.out.println(j.getdata());
    }
   Book ar[]=new Book[3];
   ar[0]=new Book("c",40);
   
   System.out.println(ar[0].getdata());
   
   System.out.println(ob1.size()+","+ob1.get(0).name);
  Iterator<Book> i=ob1.iterator();
  while(i.hasNext())
  {
	  System.out.println(i.next().getdata());
	  
  }
  }
  
}
class Book
{
	String name;
	int roll;
	Book(String n,int r)
	{
		name=n;
		roll=r;
	}
	String getdata()
	{
		return name+"\t"+roll;
	}
}