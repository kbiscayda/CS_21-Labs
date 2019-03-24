import java.util.*;

public class Items
  {

  private String name;
  private double price;
  private double amount;

  public item ()
  {
    name = "";
    price = 0;
    amount = 0;
  }

  public item (String name)
  {
    this.name = name;
    price = 0;
    amount = 0;
  }

  public item (String name, double price)
  {
    this.name = name;
    this.price = price;
    amount = 0;
  }

  public String getName()
  {
    return name;
  }

  public void setName (String newName)
  {
    name = newName;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double newPrice)
  {
    price = newPrice;
  }

  public double getAmount()
  {
    return amount;
  }

  public void setAmount(Scanner kb)
  {
    amount = input.nextDouble();
  }
}
