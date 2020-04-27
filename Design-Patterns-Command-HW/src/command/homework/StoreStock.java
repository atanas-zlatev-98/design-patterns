package command.homework;

public class StoreStock {

	private String cashier = "Nikolai";
	private String product = "Watermelons";
	private int quantity = 10;


	public void buyproducts(){
	System.out.println("Cashier " + cashier + " is going to buy" 
	+" "+  quantity +" "+ product);

	}

	public void sellproducts(){

	System.out.println("Cashier " + cashier + " is going to sell" 
	+" "+ quantity + " "+ product);

	}
	
	public void takemoney() {
		
		System.out.println("The Cashier " + cashier +
				" is taking the money!\n --- WATERMELONS SOLD ---");
	}
	
    public void givemoney() {
		
		System.out.println("The Cashier " + cashier +
				" is giving the money!\n --- WATERMELONS BOUGHT ---");
	}
}
