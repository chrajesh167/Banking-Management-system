import java.util.*;
public class Bankingapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The CustomerName");
		String customername=s.nextLine();
		System.out.println("Enter The CustomerId");
		String customerid=s.nextLine();
		bankaccount obj1=new bankaccount(customername,customerid); 
        obj1.showmenu();
	}

}
class bankaccount
{
	int balance;
	int previoustransaction;
	String customername;
	String customerId;
	bankaccount( String cname,String cid){
		customername=cname;
		customerId=cid;
	}
	void deposit(int amount) {
		if(amount !=0) {
			balance=balance+amount;
			previoustransaction=amount;
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			previoustransaction=-amount;
		}
	}
	void getprevioustransaction() {
		if(previoustransaction >0) {
			System.out.println("Desposited"+previoustransaction);
		}
		else if(previoustransaction <0) {
			System.out.println("Withdraw"+Math.abs(previoustransaction));			
		}
		else {
			System.out.println("No transaction occured");
	
		}
		
	}
	void showmenu() {
		char option='\25';
		Scanner s =new Scanner(System.in);
		System.out.println("Welcome"+customername);
		System.out.println("Your ID is"+customerId);
		System.out.println("\n");
		System.out.println("A.check balance");
		System.out.println("B. deposit");
		System.out.println("C. Withdraw");
		System.out.println("D.previous transaction");
		System.out.println("E.Exit");
		
		do {
			System.out.println("======================================");
			System.out.println("Enter An option");
			System.out.println("======================================");
			option=s.next().charAt(0);
			System.out.println("\n");
			switch(option) {
			case 'A':
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Balance="+balance);
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Enter Amount to deposit");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
				int amount=s.nextInt();
				deposit(amount);
				System.out.println("Successfully Despoited");
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Enter an amount to withdraw");
				System.out.println("-=-=-=-=-=-==-=-=-=-=--");
				int amount2=s.nextInt();
				withdraw(amount2);
				break;
			case 'D':
				System.out.println("=-=-=-=-=-=-=-=-=-=-=--");
				getprevioustransaction();
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("*******************");
				break; 
				default:
					System.out.println("Invaild option!.Please enter again");
					break;
			}
		
			}
		while(option!='E'); 
			System.out.println("Thankyou for using our services");
			
	}
}