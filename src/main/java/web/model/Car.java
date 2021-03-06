package web.model;

public class Car {
    private String brand;
    private String model;
    private Integer productionYear;

    public Car(String brand, String model, Integer productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car() {
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }
}
