package command.homework;

public class buyProduct implements Store {

		private StoreStock watermelonStock;

		public buyProduct(StoreStock watermelonStock){
		      this.watermelonStock = watermelonStock;
		   }

		   public void execute() {
		      watermelonStock.buyproducts();
		   }


}

