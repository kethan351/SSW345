public class MyPizzaApp{
    public static void main(String[] args){

        if (args[1].equals("cheese") == false && args[1].equals("clam") == false && args[1].equals("veggie") == false && args[1].equals("pepperoni") == false){
            System.out.println("Invalid input, please input cheese, clam, veggie, or pepperoni for pizza type.");
        }
        else{
            String type = args[1];

            if (args[0].equals("NYPizzaStore")) {
                PizzaStore nyPizzaStore = new NYPizzaStore();
		        Pizza pizzaTime = nyPizzaStore.orderPizza(type);
                System.out.println();
                System.out.print(pizzaTime);
            }
            else if (args[0].equals("ChicagoPizzaStore")){
                PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		        Pizza pizzaTime = chicagoPizzaStore.orderPizza(type);
                System.out.println();
                System.out.print(pizzaTime);
            }
            else{
                System.out.println("Invalid input, please input NYPizzaStore or ChicagoPizzaStore for franchise name.");
            }
	    }
    }
}