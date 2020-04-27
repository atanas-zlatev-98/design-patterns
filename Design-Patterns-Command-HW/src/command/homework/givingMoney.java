package command.homework;

public class givingMoney implements Store {


	private StoreStock giveMoney;

	public givingMoney(StoreStock giveMoney){
	      this.giveMoney = giveMoney;
	   }

	   public void execute() {
	      giveMoney.givemoney();
	   }


}

