import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Beverage extends Product {
    private LocalDate expirationDate;

    public Beverage(String name, String brand, float price, LocalDate expirationDate) {
        super(name, brand, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public int calculateDiscount() {
        LocalDate expirationDate = LocalDate.parse(this.expirationDate.toString());
        LocalDate currentDate = LocalDate.parse(LocalDate.now().toString());
        long diffDays = ChronoUnit.DAYS.between(expirationDate, currentDate);

        if(diffDays < 5 && diffDays > 0){
            return 10;
        }else if(diffDays == 0){
            return 50;
        }

        return 0;
    }

}
