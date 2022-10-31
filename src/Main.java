import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> menu = new HashSet<>();

        menu.add(new Product("Пыво", 15, 3));
        menu.add(new Product("Пыво", 15, 3));
        menu.add(new Product("Пыво", 15, 3));
        menu.add(new Product("Колбаса", 65.50, 2));
        menu.add(new Product("Сосиски", 165.20, 5));
        menu.add(new Product("Макароны", 15.70, 20));

        for (Object prod : menu) {
            System.out.println(prod);
        }

        Set<Product> menu1 = new HashSet<>();

        menu1.add(new Product("Чай", 15.70, 2));
        menu1.add(new Product("Сахар", 1.30, 10));
        menu1.add(new Product("Лимон", 5.50, 5));
        menu1.add(new Product("Мед", 135.70, 4));

        for (Object prod : menu1) {
            System.out.println(prod);
        }

        Recipe obed = new Recipe("Обед дня");
        Recipe tea = new Recipe("Чай, Индийский чай");

        RecipesBook bookCook = new RecipesBook();
        bookCook.addRecipe(obed);
        bookCook.addRecipe(tea);



    }


}

