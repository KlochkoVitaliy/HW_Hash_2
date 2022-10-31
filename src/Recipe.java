import java.util.*;

public class Recipe {

    private String nameOfTheRecipe;
    private double sumCastProducts;

    private final Map<Product, Integer> products = new HashMap<>();
//    private Set<Product> products;

    public Recipe(String nameOfTheRecipe) {

        if (nameOfTheRecipe != null && !nameOfTheRecipe.isEmpty() && !nameOfTheRecipe.isBlank()) {
            this.nameOfTheRecipe = nameOfTheRecipe;
        }
        this.sumCastProducts = 0;
        RecipesBook.recipeBook.add(this);
    }

    public void addProductInRecipe(Product product, int quantity){
        if(products.containsKey(product)){
            throw new RuntimeException("Ошибка!!! ");
        }
        products.put(product, quantity);
//        sumCastProducts = sumCastProducts + product.getPrice()*requiredQuantity;
    }

    public int getCostForProduct(){
        int sum = 0;
        for (Product key: products.keySet()){
            sum+=products.get(key) * key.getPrice();
        }
        return sum;
    }
//    private double setSum(Set<Product> products) {
//        double sum = 0;
//        for (Product product : products) {
//            sum += product.getPrice() * product.getQuantity();
//        }
//        return sum;
//    }

    public double getSumCastProducts() {
        return sumCastProducts;
    }

    public String getNameOfTheRecipe() {
        return nameOfTheRecipe;
    }

    public Map getProducts() {
        return products;
    }

    public static void recipe() {
        Set recipe = new HashSet();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes1 = (Recipe) o;
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
