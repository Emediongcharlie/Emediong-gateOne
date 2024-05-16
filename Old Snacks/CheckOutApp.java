import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
	public class CheckOutApp{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	Date date = new Date();

	String sales = null;
	
	int i = 0;
	int counter = 0;
	double discountAmount=0;
	double vatValue = 0;
	double billTotal = 0;
	double discount = 0;
	

	ArrayList<String> products = new ArrayList<String>();
	ArrayList<Double> qtys = new ArrayList<Double>();
	ArrayList<Double> prices = new ArrayList<Double>();
	ArrayList<Double> totals = new ArrayList<Double>();
	ArrayList<Double> subTotals = new ArrayList<Double>();
	double subTotal = 0;
	
	
	System.out.println("Customer's name:");
        String customer = input.nextLine();


do{
	System.out.println("\nWhat did the user buy?");
	String product = input.nextLine();
	products.add(product);
	System.out.println("How many pieces?");
	double qty = input.nextDouble();
	qtys.add(qty);
	System.out.println("How much per unit?");
	double price = input.nextDouble();
	subTotal += price * qty;
	prices.add(price);
	
	
	System.out.print("Do you need more items,Yes or No?");
	sales = input.next();
	input.nextLine();

	double total = qty * price;
	totals.add(total);

	//double subTotal = total + totals.get(i);
	//subTotals.add(subTotal);

	

	double vat = 17.50 / 100;
	vatValue = vat * subTotal;


	counter++;

	}while(sales.equalsIgnoreCase("Yes"));
	
	System.out.println("Cashier name:");
        String name = input.nextLine();

	System.out.print("How much discount will he get:");
	discount = input.nextDouble();
	double discountRate = discount / 100;
	discountAmount = discountRate * subTotal;
	
	billTotal = subTotal + vatValue - discountAmount;
	
	System.out.println("\nSEMICOLON STORES");
	System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACUALEY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("Date and time:" + date);
		System.out.println("Cashier name:" + name);
		System.out.println("Customer's name:" + customer);
		

		 
		
		String line = """
		==============================================================
		""";
		System.out.print(line);
		System.out.printf("%8s %8s %8s %10s ", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
		String menu = """
		\n
	--------------------------------------------------------------
		""";
		System.out.print(menu);

	for(i = 0; i < products.size(); i++){
		System.out.printf("\n%8s %8.2f %8.2f %8.2f ", products.get(i), qtys.get(i), prices.get(i), totals.get(i));
		}
		String another = """
		\n
	--------------------------------------------------------------
		""";
		System.out.print(another);

	
		System.out.printf("%24s  %8.2f%n ", "subTotal:", subTotal);
		System.out.printf("%24s  %8.2f%n ", "Discount:", discountAmount);
		System.out.printf("%24s  %8.2f%n ", "Vat @ 17.50%:", vatValue);
		System.out.println("\n==============================================================");

		System.out.printf("%24s  %8.2f%n ", "Bill Total:", billTotal);	
	System.out.println("\n==============================================================");

	System.out.printf("%s %.2f", "THIS IS NOT THE RECEIPT KINDLY PAY ", billTotal);

	System.out.println("\n==============================================================");

	System.out.print("\nHow much did the customer give to you?");
	double amountGiven = input.nextDouble();

	double balance =  amountGiven - billTotal;
	

System.out.println("\nSEMICOLON STORES");
	System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACUALEY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("Date and time:" + date);
		System.out.println("Cashier name:" + name);
		System.out.println("Customer's name:" + customer);
		

		 
		
		String second = """
		==============================================================
		""";
		System.out.print(second);
		System.out.printf("%8s %8s %8s %10s ", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
		String third = """
		\n
	--------------------------------------------------------------
		""";
		System.out.print(third);

	for(i = 0; i < products.size(); i++){
		System.out.printf("\n%8s %8.2f %8.2f %8.2f ", products.get(i), qtys.get(i), prices.get(i), totals.get(i));
		}
		String fourth = """
		\n
	--------------------------------------------------------------
		""";
		System.out.print(fourth);

	
		System.out.printf("%24s  %8.2f%n ", "subTotal:", subTotal);
		System.out.printf("%24s  %8.2f%n ", "Discount:", discountAmount);
		System.out.printf("%24s  %8.2f%n ", "Vat @ 17.50%:", vatValue);
		System.out.println("\n==============================================================");

		System.out.printf("%24s  %8.2f%n ", "Bill Total:", billTotal);
		System.out.printf("%24s  %8.2f%n ", "Amount Paid:", amountGiven);
		System.out.printf("%24s  %8.2f%n ", "Balance:", balance);
			
	System.out.println("\n==============================================================");

	System.out.printf("%8s", "THANK YOU FOR YOUR PATRONAGE");

	System.out.println("\n==============================================================");


}
}