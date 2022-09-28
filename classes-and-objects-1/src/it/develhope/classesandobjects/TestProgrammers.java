package it.develhope.classesandobjects;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer pro1 = new Programmer();
        pro1.name = "Valerio";
        pro1.age = 23;
        pro1.wearGlasses = true;

        Programmer pro2 = new Programmer();
        pro2.name = "Daniele";
        pro2.age = 27;
        pro2.wearGlasses = true;

        System.out.println(pro1.print1());
        System.out.println(pro2.print2());
    }
}
