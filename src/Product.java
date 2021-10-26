public abstract class Product {
    private String name;
    private String brand;
    private float price;
    private float amount;
    private int discount;

    public Product(String name, String brand, float price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public abstract int calculateDiscount();
}
