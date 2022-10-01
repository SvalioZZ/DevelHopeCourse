import java.util.Objects;

public class Smartphone implements Cloneable{

    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return "---- Smartphone ----" +
                "\n brandName = '" + brandName + '\'' +
                "\n modelName = '" + modelName + '\'' +
                "\n batterymAh = " + batterymAh +
                "\n producerPrice " + producerPrice +
                "\n retailPrice " + retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        return batterymAh == that.batterymAh && brandName.equals(that.brandName) && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice) && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;
    }

    public Smartphone (String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }
}



