public class Product {
    private String code = "";
    private String name = "";
    private Double price = 0.0;

    public Product() {
    }

    public Product(String code, String name, double price) {
        setCode(code);
        setName(name);
        setPrice(price);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toProduct() {
        return getCode() + "," + getName() + "," + getPrice() + "\n";
    }

    public String toString() {
        return "Code : " + getCode() + " ; Name : " + getName() + " ; Price : " + getPrice();
    }
}
