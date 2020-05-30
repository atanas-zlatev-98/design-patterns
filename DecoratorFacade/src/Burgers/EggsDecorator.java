package Burgers;

public class EggsDecorator extends BurgerDecorator {

	public EggsDecorator(Burger burgerPrepare) {
		super(burgerPrepare);
		// TODO Auto-generated constructor stub
	}

	public void prepare() {
		
		burgerPrepare.prepare();
		addEggs(burgerPrepare);
		
	}
	
	
	public void addEggs(Burger burgerPrepare) {
		System.out.println("Adding Eggs to the Classic Burger");
		
	}
}
