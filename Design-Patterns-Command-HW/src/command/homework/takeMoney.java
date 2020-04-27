package command.homework;

public class takeMoney implements Store{

	private StoreStock takeMoney;

	public takeMoney(StoreStock takeMoney){
	      this.takeMoney = takeMoney;
	   }

	   public void execute() {
	      takeMoney.takemoney();
	   }


}
