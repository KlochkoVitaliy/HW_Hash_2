
public class Main {
    public static void main(String[] args) {

        Product product = new Product("Продукты", 10, 1);

        product.getProducts().add(new Product("Пыво", 15, 3));
        product.getProducts().add(new Product("Пыво", 15, 3));
        product.getProducts().add(new Product("Пыво", 15, 3));
        product.getProducts().add(new Product("Колбаса", 65.50, 2));
        product.getProducts().add(new Product("Сосиски", 165.20, 5));
        product.getProducts().add(new Product("Макароны", 15.70, 20));

        for (Object prod : product.getProducts()) {
            System.out.println(prod);
        }

        Recipes recipes = new Recipes("Имя рецепта", "Продукты", 100);
//        recipes.getRecipes().add(new Recipes("Суп", recipes.getLotsOfProducts(), recipes.getSumCastProducts()));

        recipes.getRecipes().add("Суп");
        recipes.getRecipes().add("Пирог");
        recipes.getRecipes().add("Пирог");
        recipes.getRecipes().add("Каша");

        for (Object recipe : recipes.getRecipes()) {
            System.out.println(recipe);
        }

//        HashSet<String> recipes = new HashSet<>();
//        recipes.add("Cуп");

//        ArrayList pro = new ArrayList();            //test
//        pro.add(banana);
//        pro.add(banana);
//        pro.add(lemon);
//        pro.add(orange);
//        pro.add(orange);

//        Set prod = new HashSet();
//
//        prod.add(banana);
//        prod.add(banana);
//        prod.add(lemon);
//        prod.add(lemon);
//        prod.add(orange);
//
//        prod.remove(banana);


//        System.out.println("Начальные значения: ");
//        System.out.println(Arrays.toString(pro.toArray()));
//        System.out.println("Конечные значения: ");
//        System.out.println(Arrays.toString(prod.toArray()));


    }
}

