package command.homework;
import java.util.ArrayList;
import java.util.List;

public class Customer {


	   private List<Store> orderProducts = new ArrayList<Store>(); 

	   public void takeOrder(Store order){
	      orderProducts.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (Store order : orderProducts) {
	         order.execute();
	      }
	      orderProducts.clear();
	   }
}
