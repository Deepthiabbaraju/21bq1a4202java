import java.util.Scanner;
public class InvoiceTest
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      Invoice in=new Invoice();
      System.out.print("Enter part number :");
      in.setpartnumber(sc.next());
      System.out.print("Enter no. of items purchased :");
      in.setquantity(sc.nextInt());
      System.out.print("Enter part description :");
      in.setpartdescription(sc.next());
      System.out.print("Enter price per item :");
      in.setpriceperitem(sc.nextDouble());
      System.out.print(" Item Details \n");
      System.out.print("Part number :" + in.getpartnumber()+"\n");
      System.out.print("\nPart description :" + in.getpartdescription()+"\n");
      System.out.print("\nTotal Billing Amount :" + in.getInvoiceAmount()+"\n");
  }
}
