import java.time.DayOfWeek;
import java.time.LocalDate;

public class Clothes extends Product{
    private String size;
    private String color;


    public Clothes(String name, String brand, float price, String size, String color) {
        super(name, brand, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int calculateDiscount(){
        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();

        if(currentDay.name() != "SATURDAY" && currentDay.name() != "SUNDAY"){
            return 10;
        }

        return 0;
    }
}
