package Burgers;

public class CheeseAndEggs extends BurgerDecorator {

	public CheeseAndEggs(Burger burgerPrepare) {
		super(burgerPrepare);
		// TODO Auto-generated constructor stub
	}

    public void prepare() {
		
		burgerPrepare.prepare();
		addCheeseAndEggs(burgerPrepare);
		
	}
	
	
	public void addCheeseAndEggs(Burger burgerPrepare) {
		System.out.println("Adding Cheese and Eggs to the Classic Burger");
		
	}
	
	
	
}
