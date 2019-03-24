import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
public class Shop
{

public static String[] itemName(String [] productName)
{
	for(int i = 0; i<products.length; i++)
	{
		out.print("Enter the name of product " + i + " : ");
		productName[i] = kb.Next();
	}
	return productName;
}

public static double [] itemPrice (String [] items)
{
	for (int i =0; i< items ; i++){
		out.print("Enter the price of product " + i + ": ");
		itemPrice[i]=kb.next();
	}
	return void;
}

public static double [] itemDiscount(String [] items)
{
	out.print("Please enter the number of packages ('x') to qualify for Special Discount (buy 'x' get 1 free): ");
	Discount = kb.nextDouble();
	return
}

public static double [] moneyDiscount(String [] items)
{
	out.print("Enter the dollar amount to qualify for Additional Discount (or 0 if none offered): ");
	moneyDiscount = kb.nextDouble();// cus it is money value boohoo
	out.print("Enter the Additional Discount rate (e.g., 0.1 for 10%): ");
	rate = kb.nextDouble ();
	if (rate > 0 && rate <= .5){

	}

}

	public static void main (String[]args)
  {
  int function;
  String [] products;
		Scanner kb = new Scanner(in);
    out.println("This program supports 4 functions: ");
    out.println("1. Setup Shop");
    out.println("2. Buy Items");
    out.println("3. List Items");
    out.println("4. Checkout");
    out.print("Please choose the function you want: ");
    function = kb.nextInt();
  	if(function == 1)
    {
      out.print("Please enter the number of items to setup shop: ");
      products = new String [kb.nextInt()-1];
			itemName(product);
			itemPrice(product);
			item
    }
    if(function == 2)
    {
      out.print("Shop is not set up yet!");
    }
		if(function == 3)
    {
      out.print("Shop is not set up yet!");
    }
    if(function == 4)
    {
      out.print("Shop is not set up yet!");
    }



  }
