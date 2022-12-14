import java.util.Collection;
import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    public String priceType;
    public double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return "---- SmartphonePrice ----" +
                "\n priceType = '" + priceType + '\'' +
                "\n priceInEuros = " + priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartphonePrice that)) return false;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    public SmartphonePrice (String type, double priceE){
        this.priceType = type;
        this.priceInEuros = priceE;

    }
}
