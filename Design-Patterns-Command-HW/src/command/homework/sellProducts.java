package command.homework;

public class sellProducts implements Store {

		private StoreStock watermelonStock;

		public sellProducts(StoreStock watermelonStock){
		      this.watermelonStock = watermelonStock;
		   }

		   public void execute() {
		      watermelonStock.sellproducts();
		   }


}

