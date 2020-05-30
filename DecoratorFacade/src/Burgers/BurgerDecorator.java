package Burgers;

public class BurgerDecorator implements Burger {

	
	protected Burger burgerPrepare;
	
	public BurgerDecorator(Burger burgerPrepare) {
		this.burgerPrepare = burgerPrepare;
	}
	
	
	@Override
	public void prepare() {
		this.burgerPrepare.prepare();

	}

}
