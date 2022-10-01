package it.develhope.abstactionOverride;


/**
 * this class Car will extend the class vehicle so that
 * we can proceed using all what's stuffed inside the class
 * vehicle
 */
public class Car extends Vehicle {

    public int numbersOfDoors;
    public double carPrice;

    /**
     * an override of the method showVehicleDetails
     * to show the very car information.
     */
    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Numbers of doors: " + numbersOfDoors +
                "\nPrice of the car: " + carPrice + " $");
    }
    /** override of doVehicleSound to reproduce vehicle sound */
    @Override
    void doVehicleSound() {
        super.doVehicleSound();

        System.out.println("WHROOOOMMMM!!");
    }

    /**
     * CONSTRUCTOR OF CAR'S CLASS:
     * thanks to this class we can now create new car object.
     * @param type type of the vehicle
     * @param wheels number of wheels
     * @param doors doors of the vehicle
     * @param price listing price of the vehicle
     */
    public Car (String type, int wheels, int doors, double price){
        this.carPrice = price;
        this.numberOfWheels = wheels;
        this.numbersOfDoors = doors;
        this.type = type;
    }
}
