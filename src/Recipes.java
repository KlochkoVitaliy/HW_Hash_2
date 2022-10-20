import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    private String nameOfTheRecipe;
    private final String lotsOfProducts;
    private final double sumCastProducts;

    private Set recipes;

    public Recipes(String nameOfTheRecipe, String lotsOfProducts, double sumCastProducts) {

        this.nameOfTheRecipe = nameOfTheRecipe;
        this.lotsOfProducts = lotsOfProducts;
        this.sumCastProducts = sumCastProducts;
        this.recipes = new HashSet();
    }

    public String getLotsOfProducts() {
        return lotsOfProducts;
    }

    public double getSumCastProducts() {
        return sumCastProducts;
    }

    public String getNameOfTheRecipe() {
        if (nameOfTheRecipe != null && !nameOfTheRecipe.isEmpty() && !nameOfTheRecipe.isBlank()) {
            this.nameOfTheRecipe = nameOfTheRecipe;
        } else {
            throw new IllegalArgumentException("Такое название рецепта уже существует! ");
        }
        return nameOfTheRecipe;
    }

    public Set getRecipes() {
        return recipes;
    }

    public static void recipe (){
        Set recipe = new HashSet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes1 = (Recipes) o;
        return Double.compare(recipes1.sumCastProducts, sumCastProducts) == 0 &&
                Objects.equals(lotsOfProducts, recipes1.lotsOfProducts) &&
                Objects.equals(nameOfTheRecipe, recipes1.nameOfTheRecipe) &&
                Objects.equals(recipes, recipes1.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lotsOfProducts, sumCastProducts, nameOfTheRecipe, recipes);
    }

    @Override
    public String toString() {
        return "Наименование рецепта: " + nameOfTheRecipe +
                ", ингридиенты: '" + lotsOfProducts +
                ", сумма продуктов = " + sumCastProducts ;
    }

}
