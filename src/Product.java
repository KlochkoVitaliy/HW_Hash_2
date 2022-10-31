import java.util.*;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.quantity = quantity;
        if (name != null && !name.isEmpty() && !name.isBlank() && price > 0) {
            this.name = name;
            this.price = price;
     //       addProductToList(this);
        } else {
            throw new IllegalArgumentException("Заполните карточку товара" + name + "полностью!!");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(product1.price, price) == 0 && quantity == product1.quantity && Objects.equals(name, product1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return name + " - стоимость = " + price + ", кол-во = " + quantity + " кг.";
    }
}
