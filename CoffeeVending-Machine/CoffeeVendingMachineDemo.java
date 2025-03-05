package coffeevendingmachine;

class Main{
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();

        coffeeMachine.DisplayMenu();

        coffeeMachine.PlaceOrder("latte", 150);

        machine.PlaceOrder("cappucino", 220);
        machine.AddMilk(500);
        machine.AddCoffee(100);
    }
}