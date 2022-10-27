import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    private String nameOfTheRecipe;
    private double sumCastProducts;

    private Set<Product> products;

    public Recipes(String nameOfTheRecipe, Set<Product> products) {

        if (nameOfTheRecipe != null && !nameOfTheRecipe.isEmpty() && !nameOfTheRecipe.isBlank()) {
            this.nameOfTheRecipe = nameOfTheRecipe;
        }
        if (products!=null && !products.isEmpty()) {
            this.products = products;
        }else{
            throw new RuntimeException();
        }
        this.sumCastProducts = setSum(products);

    }

    private double setSum(Set<Product> products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice() * product.getQuantity();
        }
        return sum;
    }

    public double getSumCastProducts() {
        return sumCastProducts;
    }

    public String getNameOfTheRecipe() {
        return nameOfTheRecipe;
    }

    public Set getProducts() {
        return products;
    }

    public static void recipe() {
        Set recipe = new HashSet();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes1 = (Recipes) o;
        return Objects.equals(nameOfTheRecipe, recipes1.nameOfTheRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheRecipe, sumCastProducts, products);
    }

    @Override
    public String toString() {
        return "Наименование рецепта: " + nameOfTheRecipe +
                ", сумма продуктов = " + sumCastProducts;
    }

}
