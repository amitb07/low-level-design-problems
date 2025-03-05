package coffeevendingmachine;

class Drink{
    Recipe recipe;
    int price;
    String name;
    Drinks(String name, Recipe recipe) {
        this.recipe = recipe;
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    int getPrice(){
        return this.price;
    }
    Recipe getRecipe(){
        return this.recipe;
    }
}
