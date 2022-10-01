package it.develhope.abstactionOverride;

/**
 * DESCRIPTION -----
 * @author  Valerio Corallini
 * @version 0.0
 * <P>
 * the exercise tasks was to print in console the info of the boat object.
 * Indeed, I completed the task adding also all the other methods of all classes.
 * ----- START -----
 * The program is starting here, it will print in console all the methods that we
 * have coded in the other classes.
 * <P>
 */
public class Start {
    public static void main(String[] args) {

        /**
         * initializing new objects, for class Car and class boat
         */

        Car car = new Car("Truck", 4, 5, 49999.99);
        Boat boat = new Boat("Sail Boat", 350.00, 1500);

        /**
         * calling all the methods for the new objects
         */
        car.showVehicleDetails();
        boat.showVehicleDetails();

        car.doVehicleSound();
        boat.doVehicleSound();

        String gettingInfoBoat = boat.getBoatWeightAndSpeed();
        System.out.println(gettingInfoBoat);
    }
}
