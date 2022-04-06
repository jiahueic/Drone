package jiahueic.drone;

/**
 * A class for representing a FLOAT-E Drone.
 *
 * @author: Cheah Jia Huei
 */
public class Drone {

    // TODO: Declare some instance variables here.
    private double batterySize; //number of batteries
    private int numberOfFilters;

    // TODO: Declare some constructors here.
    public Drone(double maxBattery, int numberOfFilters){
        this.batterySize=maxBattery;
        this.numberOfFilters=numberOfFilters;
    }



    /**
     * Triggers the drone to start cleaning the body of water.
     * Cleaning continues until the drone is low on battery or the water body is cleaned.
     * Output is printed by this method to show the status of the clean.
     *
     * @param waterBody the body of water to be cleaned by the drone
     */
    public void clean(WaterBody waterBody, Battery battery, Drone drone) {

        // TODO: Implement the output with correct values.
        System.out.println("Clean initiated for a drone with " + this.numberOfFilters +
                " filters, and battery with charge of " + drone.getBatterySize()+ " units.");
        System.out.println("Water body has a surface size of " + waterBody.getSurfaceSize() + " units.");
        System.out.println();

        int numCleanStepsTaken = 0;

        // Keep cleaning the water while we have battery, and the water is not yet clean.
        //System.out.println(battery.isLow());
        //System.out.println(waterBody.isClean());
        System.out.println("Battery: "+String.format("%.1f",battery.getCurrentBatteryCharge())+"%"+" | Plastic: "+String.format("%.3f", waterBody.getPlasticBodyPercentage()));

        while(!(battery.isLow())&&!(waterBody.isClean())) { // TODO: Implement a correct guard here.

            // TODO: Each cleaning step drains some battery.
            battery.drain();
            waterBody.clean(drone);
            System.out.println("Battery: "+String.format("%.1f",battery.getCurrentBatteryCharge())+"%"+" | Plastic: "+String.format("%.3f", waterBody.getPlasticBodyPercentage()));
            // TODO: Clean the water body once per filter.


            numCleanStepsTaken++;

        }

        // TODO: Implement the correct output.
        System.out.println();
        System.out.println("Cleaning stopped after " + numCleanStepsTaken + " steps.");
        System.out.print("Reason: ");
        if(waterBody.isClean()){
            System.out.print("Cleaning complete.\n");
        }
        else if(battery.isLow()){
            System.out.print("Battery was low.\n");
        }

    }
    public double getBatterySize(){
        return this.batterySize;
    }
    public int getNumberofFilters(){
        return this.numberOfFilters;
    }
    public void setBatterySize(double batterySize){
        this.batterySize=batterySize;
    }
    public void setNumOfFilters(int numberOfFilters){
        this.numberOfFilters=numberOfFilters;
    }


}
