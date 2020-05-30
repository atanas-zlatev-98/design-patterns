package Burgers;

public class DecoratorMain {

	public static void main(String[] args) {
		
     BurgerFacade burgerFacade = new BurgerFacade();
     
     burgerFacade.PrepareBurgerCheese();
     CheeseDecorator cheeseBurger = new CheeseDecorator(burgerFacade);
     cheeseBurger.prepare();
     
     burgerFacade.PrepareBurgerEggs();
     EggsDecorator EggsBurger = new EggsDecorator(burgerFacade);
     EggsBurger.prepare();
     
     burgerFacade.PrepareBurgerCheeseAndEggs();
     CheeseAndEggs cheeseEggsBurger = new CheeseAndEggs(burgerFacade);
     cheeseEggsBurger.prepare();
    
       
       

	}

}
