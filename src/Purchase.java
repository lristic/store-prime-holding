import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Purchase {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        List<Product> products = new ArrayList<Product>();

        Product apples = new Food("Apples", "BrandA", 1.50f, LocalDate.parse("2021-10-26"));
        products.add(apples);
        apples.setAmount(2.45f);

        Product milk = new Beverage("Milk", "BrandM", 0.99f, LocalDate.parse("2022-02-02"));
        products.add(milk);
        milk.setAmount(3f);

        Product tshirt = new Clothes("T-shirt", "BrandT", 15.99f, "M", "violet");
        products.add(tshirt);
        tshirt.setAmount(2f);

        Product laptop = new Appliance("Laptop", "BrandL", 2345f, "ModelL", LocalDate.parse("2021-03-03"), 1.125f);
        products.add(laptop);
        laptop.setAmount(1f);

        Cart c = new Cart(products);
        LocalDateTime now = LocalDateTime.now();

        Cashier cash = new Cashier();
        cash.printReceipt(c, now);
    }
}
