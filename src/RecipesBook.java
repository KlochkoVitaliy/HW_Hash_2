import java.util.HashSet;
import java.util.Set;

public class RecipesBook {
    private Set<Recipes> recipeBook;


    public RecipesBook() {
        recipeBook = new HashSet<>();
    }

    public Set<Recipes> getRecipeBook() {
        return recipeBook;
    }

    public void addProduct(Recipes recipes) {
        if (!recipeBook.add(recipes)) {
            throw new RuntimeException();
        }
    }
}