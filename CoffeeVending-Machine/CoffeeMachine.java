package coffeevendingmachine;

class CoffeeMachine{
    List<Drinks> menu;
    int water, milk, coffee;
    private static final CoffeeMachine instance = new CoffeeMachine();
    CoffeeMachine(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        menu = new ArrayList<Drink>();

        initializeMenu();
    }

    CoffeeMachine getInstance() {
        return instance;
    }
    
    void initializeMenu(){
        Drink latte = new Drink("Latte", new Recipe(20, 20, 60));
        Drink cappucino = new Drink("Cappucino", new Recipe(30, 30, 40));
        AddDrinkToMenu(latte);
        AddDrinkToMenu(cappucino);
    }

	Void DisplayMenu(){
        System.out.println("Please select your drink from below menu");
        for(Drink d: menu)
        {
            System.out.println(d.name+" : "+d.price);
        }
    }
    void AddDrinkToMenu(Drink drink){
        this.menu.add(drink);
    }

    Drink getDrink(String coffeeName) {
        for (Drink d : this.menu) {
            if (d.getName().equalsIgnoreCase(coffeeName)) {
                return d;
            }
        }
        return null;
    }

    void PlaceOrder(String drinkName, int amount){
        Drink drink = getDrink(drinkName);
        if(drink == null)
        {
            System.out.println("Sorry, Please select a valid drink");
            return;
        }
        if(amount < drink.price){
            System.out.println("Insufficient payment for "+drink.name);
            return;
        }
            
        int returnAmount = amount - drink.price;
        // we can replace below checks for ingredients with CheckWater, checkMilk, CheckCoffee as well 
        if(drink.recipe.water < water && drink.recipe.milk < milk && drink.recipe.coffee < coffee) {
            UpdateIngredients(drink);
            System.out.println("Please wait!! Your drink is being prepared");
            if(returnAmount){
                System.out.println("Please collect your balance amount!!");
            }
        } else{
            System.out.println("So sorry, out of ingredients");
        }
    }

	void UpdateIngredients(Drink drink){
        this.water -= drink.recipe.water;
        this.milk -= drink.recipe.milk;
        this.coffee -= drink.recipe.coffee;
        if(this.water < 100)
            System.out.println("Low ingredient Alert: Water ");

        if(this.milk < 100)
            System.out.println("Low ingredient Alert: Milk ");

        if(this.coffee < 100)
            System.out.println("Low ingredient Alert: Coffee ");
    }

    void DisplayIngredientStatus(){
        System.out.println("Ingredient Status- Coffee: "+this.coffee+" Milk: "+this.milk+" Water: "+this.water);
    }
}
