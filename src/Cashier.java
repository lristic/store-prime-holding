import java.time.LocalDateTime;

public class Cashier {

    public void printReceipt(Cart c, LocalDateTime dateTime){
        System.out.println("Date: " + dateTime.toLocalDate() + " " + dateTime.toLocalTime().toString().substring(0, dateTime.toLocalTime().toString().length()-4));
        System.out.println("--- Products ---");
        System.out.println();

        double totalDiscount = 0.0;
        double totalPrice = 0.0;
        for(Product p: c.getProducts()){
            System.out.println(p.getName() + " - " + p.getBrand());
            System.out.println(p.getAmount() + "x" + p.getPrice() + " = " + Math.round(100*p.getAmount()*p.getPrice())/100.0);

            int discount = p.calculateDiscount();
            p.setDiscount(discount);

            if (p.getDiscount() != 0){
                System.out.println("#discount " + p.getDiscount() + "% " + "-$" + Math.round(100*p.getDiscount()/100.0*p.getAmount()*p.getPrice())/100.00);
                totalDiscount += Math.round(100*p.getDiscount()/100.0*p.getAmount()*p.getPrice())/100.00;
            }


            totalPrice += p.getPrice()*p.getAmount();
            System.out.println();

        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("SUBTOTAL: $" + Math.round(100*totalPrice)/100.0);
        System.out.println("DISCOUNT: -$" + totalDiscount);

        System.out.println();
        System.out.println("TOTAL: $" + Math.round(100*(totalPrice-totalDiscount))/100.00);
    }
}
