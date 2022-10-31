import java.util.HashSet;
import java.util.Set;

public class RecipesBook {
    public static Set<Recipe> recipeBook = new HashSet<>();


//    public RecipesBook() {
//        recipeBook = new HashSet<>();
//    }

    public static void addRecipe(Recipe recipe) {
        for (Recipe recipeInCollection : recipeBook) {
            if (recipeInCollection.getNameOfTheRecipe().equals(recipe.getNameOfTheRecipe())) {
                throw new RuntimeException("Рецепт");
            }
        }
        recipeBook.add(recipe);
    }

    public Set<Recipe> getRecipeBook() {
        return recipeBook;
    }

    public static void printAllRecipes() {
        System.out.println("Book of Recipes");
        for (Recipe recipe : recipeBook) {
            System.out.println(recipe.getNameOfTheRecipe() + ": ");
            for (Object entry : recipe.getProducts().entrySet()) {
            }
            System.out.println("Общая стоимость продуктов" + recipe.getSumCastProducts() + " руб.");
        }

//    public void addProduct(Recipe recipes) {
//        if (!recipeBook.add(recipes)) {
//            throw new RuntimeException();
//        }
//    }
    }
}