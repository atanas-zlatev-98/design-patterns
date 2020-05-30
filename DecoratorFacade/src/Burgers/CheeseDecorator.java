package Burgers;

public class CheeseDecorator extends BurgerDecorator {
	
public CheeseDecorator(Burger burgerPrepare) {
		super(burgerPrepare);
		// TODO Auto-generated constructor stub
	}


public void prepare() {
		
		burgerPrepare.prepare();
		addCheese(burgerPrepare);
		
	
}
	
	public void addCheese(Burger burgerPrepare) {
		System.out.println("Adding Cheese to the Classic Burger");
		
	}
	
}
	


