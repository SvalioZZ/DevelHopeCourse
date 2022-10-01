package it.develhope.abstactionOverride;

/**
 * creating another class vehicle called boat
 * it will extend class vehicle as the previous "car" class
 */

public class Boat extends Vehicle{

    public double maxKnotsSpeed;
    public int boatKilosWeight;
    /** override of doVehicleSound to reproduce vehicle sound */
    @Override
    void doVehicleSound() {
        super.doVehicleSound();
        System.out.println("GRAAANnnnngrangrangrangrangran!");
    }

    /**
     * CONSTRUCTOR BOAT'S CLASS:
     * thanks to this class we can now create a new boat object.
     * @param type type of the vehicle
     * @param maxSpeed maximum speed of the vehicle
     * @param weight weight of the vehicle
     */
    public Boat (String type, double maxSpeed, int weight){
        this.type = type;
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }
    /** method that will return the info string for the boat */
   public String getBoatWeightAndSpeed () {
        return "----- Boat initialized -----\n" +
                "vehicle type: " + type + "\n" +
                "Max speed of the vehicle: " + maxKnotsSpeed +
                "\nWeight of the vehicle: " + boatKilosWeight + " Kg";
   }
}
