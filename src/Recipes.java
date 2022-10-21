import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    private String nameOfTheRecipe;
    private final double sumCastProducts;

    private Set<Product> recipes;

    public Recipes(String nameOfTheRecipe, double sumCastProducts) {

        if (nameOfTheRecipe != null && !nameOfTheRecipe.isEmpty() && !nameOfTheRecipe.isBlank()) {
            this.nameOfTheRecipe = nameOfTheRecipe;
        } else {
            throw new IllegalArgumentException("Такое название рецепта уже существует! ");
        }
        this.sumCastProducts = sumCastProducts;
        this.recipes = new HashSet();
    }

    public double getSumCastProducts() {
        return sumCastProducts;
    }

    public String getNameOfTheRecipe() {
        return nameOfTheRecipe;
    }

    public Set getRecipes() {
        return recipes;
    }

    public static void recipe() {
        Set recipe = new HashSet();
    }

//    public  sumProduct(Product product){
//        Set <Product> sum = HashSet<>();
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes1 = (Recipes) o;
        return Double.compare(recipes1.sumCastProducts, sumCastProducts) == 0 && Objects.equals(nameOfTheRecipe, recipes1.nameOfTheRecipe) && Objects.equals(recipes, recipes1.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheRecipe, sumCastProducts, recipes);
    }

    @Override
    public String toString() {
        return "Наименование рецепта: " + nameOfTheRecipe +
                ", сумма продуктов = " + sumCastProducts;
    }

}
