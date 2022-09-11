import java.util.Scanner;
public class ElectricityBillTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ElectricityBill eb=new ElectricityBill();
        System.out.print("Enter consumer number:");
        eb.cnum=sc.next();
        System.out.print("enter consumer name:");
        eb.cname=sc.next();
        System.out.print("enter previous month readings");
        eb.pmr=sc.nextInt();
        System.out.println("ener cmr");
        eb.cmr=sc.nextInt();
        System.out.print("enter type");
        eb.type=sc.nextInt();
        System.out.print(eb.amountcal());
    }
}



