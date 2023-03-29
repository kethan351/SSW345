import java.util.Scanner;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	/*public static void main(String[] args){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizzaTime = nyPizzaStore.orderPizza("cheese");
        System.out.println();
        System.out.print(pizzaTime);
	}*/

	/*public static void main(String[] args){
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza pizzaTime = chicagoPizzaStore.orderPizza("veggie");
        System.out.println();
        System.out.print(pizzaTime);
	}*/
}
