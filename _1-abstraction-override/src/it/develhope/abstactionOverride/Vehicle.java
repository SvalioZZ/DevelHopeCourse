package it.develhope.abstactionOverride;


/**
 * I'm defining an abstract Class Vehicle so inside I
 * can use overridable abstract methods
 */
public abstract class Vehicle {
    String type;
    int numberOfWheels;

    /**
     * the method will print in console all the stuff about
     * the new vehicle just created
     */

    public void showVehicleDetails(){
        System.out.println("Vehicle created ..." +
                "\n-------------------------" +
                "\nType of the vehicle: " + type +
                "\nNumber of wheels: " + numberOfWheels);
    }
    /** an abstract method to print the vehicle's engine sound */
    void doVehicleSound(){

    }
}
