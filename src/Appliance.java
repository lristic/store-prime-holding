import java.time.DayOfWeek;
import java.time.LocalDate;

public class Appliance extends Product{
    private String model;
    private LocalDate productionDate;
    private float weight;


    public Appliance(String name, String brand, float price, String model, LocalDate productionDate, float weight) {
        super(name, brand, price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public int calculateDiscount(){
        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();

        if(currentDay.name() == "SATURDAY" || currentDay.name() == "SUNDAY" && this.getPrice() > 999f){
            return 10;
        }
        return 0;
    }
}
