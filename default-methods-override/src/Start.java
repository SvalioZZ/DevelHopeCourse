

public class Start {

    public static void main(String[] args) {

        SmartphonePrice smartphonePrice1 = new SmartphonePrice("Producer", 100);
        SmartphonePrice smartphonePrice2 = new SmartphonePrice("Producer", 75);
        SmartphonePrice smartphonePrice3 = new SmartphonePrice("Retail", 600);
        SmartphonePrice smartphonePrice4 = new SmartphonePrice("Retail", 450);

        Smartphone smartphone1 = new Smartphone("Apple", "IPhone 14", 4000, smartphonePrice1, smartphonePrice3);
        Smartphone smartphone2 = new Smartphone("Samsung", "S20Ultra", 4500, smartphonePrice2, smartphonePrice4);

        System.out.println("---- first smartphone ----" +
                "\n" + smartphone1);
        System.out.println("---- second smartphone ----" +
                "\n" + smartphone2);
        System.out.println("Is first smartphone equals to the second?" + "\n" +
                smartphone1.equals(smartphone2));

        try {
            Smartphone clonedSmartphone = smartphone2.clone();
            System.out.println("---- cloned phone ----" + "\n" +
                    clonedSmartphone);
            System.out.println("Is the second smartphone equals to the one cloned?" +
                    "\n" + smartphone2.equals(clonedSmartphone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Something went wrong ...");
        }
    }
}
