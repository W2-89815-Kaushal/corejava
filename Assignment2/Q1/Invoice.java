import java.util.Scanner;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity ;
	private double pricePerItem;
	
	public Invoice(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter partNumber :");
		this.partNumber =sc.nextLine();
		System.out.println("Enter quantity :");
		this.quantity =sc.nextInt();
		System.out.println("Enter partDescription :");
		sc.nextLine();
		this.partDescription =sc.nextLine();
		System.out.println("Enter pricePerItem :");
		this.pricePerItem =sc.nextDouble();
		sc.close();
	}
	public String getPartNumber(){
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber=partNumber;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription=partDescription;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity>0) {
			this.quantity=quantity;
		}else {
			this.quantity=0;
		}
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem>0){
			this.pricePerItem=pricePerItem;
		}else {
			this.pricePerItem=0;
		}
	}
	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	}
	
}
 