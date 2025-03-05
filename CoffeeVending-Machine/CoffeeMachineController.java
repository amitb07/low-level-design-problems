package coffeevendingmachine;

class CoffeeMachineController{
    CoffeeMachine coffeeMachine;
    CoffeeMachineController(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    void AddMenu(Drink drink) {
        this.coffeeMachine.AddDrinkToMenu(drink);
    }

    void updateDrinkPrice(Drink drink, int newPrice) {
        drink.price = newPrice;
    }

    void updateRecipe(Drink drink, Recipe newRecipe) {
        drink.recipe = newRecipe;
    }
}