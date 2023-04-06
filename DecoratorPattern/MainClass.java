
public class MainClass {
	public MainClass() {
		Pizza pizza = new MargheritaPizza();
		pizza = new MushroomDecorator(pizza);
		pizza = new PepperoniDecorator(pizza);
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
	public static void main(String[] args) {
		new MainClass();
	}
}
