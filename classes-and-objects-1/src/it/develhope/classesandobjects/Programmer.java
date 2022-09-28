package it.develhope.classesandobjects;

public class Programmer {

    public String name;
    public int age;
    public boolean wearGlasses;

    public  String drinkCoffe() {
        return "Espresso is the secret";
    }
    public  String printDetails() {
        return name + " is a " + age + "-yo programmer";
    }
    public String hasGlasses() {
        if (wearGlasses) {
            return name + " wear glasses!";
        } else {
            return name + " doesn't wear glasses";
        }
    }
    public String print1(){
        return printDetails() + " - " + drinkCoffe();
    }
    public String print2(){
        return printDetails() + " - " + hasGlasses();
    }
}

