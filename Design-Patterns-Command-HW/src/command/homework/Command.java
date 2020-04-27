package command.homework;

public class Command {
	public static void main(String[] args) {
		
	      StoreStock watermelon = new StoreStock();

	      buyProduct buyWatermelon = new buyProduct(watermelon);
	      
	      sellProducts sellWatermelon = new sellProducts(watermelon);
	      
	      takeMoney takemoney = new takeMoney(watermelon);
	      
          givingMoney givemoney = new givingMoney(watermelon);
	      
	      Customer customer = new Customer();
	     
	      
	      
	      
	      customer.takeOrder(sellWatermelon);
	      customer.takeOrder(takemoney);
	      
	      customer.takeOrder(buyWatermelon);
	      customer.takeOrder(givemoney);
	      
	     
          
          
	      customer.placeOrders();
	   }
}
