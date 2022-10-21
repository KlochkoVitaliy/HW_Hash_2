import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> product = new HashSet<>();

        product.add(new Product("Пыво", 15, 3));
        product.add(new Product("Пыво", 15, 3));
        product.add(new Product("Пыво", 15, 3));
        product.add(new Product("Колбаса", 65.50, 2));
        product.add(new Product("Сосиски", 165.20, 5));
        product.add(new Product("Макароны", 15.70, 20));

        for (Object prod : product) {
            System.out.println(prod);
        }

        Recipes recipes = new Recipes("Имя рецепта", 100);

        recipes.getRecipes().add("Суп");
        recipes.getRecipes().add("Пирог");
        recipes.getRecipes().add("Пирог");
        recipes.getRecipes().add("Каша");

        for (Object recipe : recipes.getRecipes()) {
            System.out.println(recipe);
        }



    }
}

