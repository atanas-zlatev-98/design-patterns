package Burgers;

public class BurgerFacade implements Burger {

	private Burger cheese;
	private Burger eggs;
	private Burger cheeseAnDeggs;
	
	public BurgerFacade() {
		
		this.cheese = new Cheese();
		this.eggs = new Eggs();
		this.cheeseAnDeggs = new CheeseEggs();

	}
	public void PrepareBurgerCheese() {
		
		cheese.prepare();
		
	} 
	
    public void PrepareBurgerEggs() {
		
		eggs.prepare();
		
	} 

    public void PrepareBurgerCheeseAndEggs() {
		
  		cheeseAnDeggs.prepare();
  		
  		
  	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub

	}

}
