package jiahueic.drone;

/**
 * A class for representing a battery used to power FLOAT-E drones.
 *
 * @author : Cheah Jia Huei
 */
public class Battery {
    private double maxBatteryCharge;
    private double currentBatteryCharge;

    // TODO: Declare some instance variables here.
    public Battery(){
        this(100,100);
    }
    public Battery(double maxBatteryCharge, double currentBatteryCharge){
        this.maxBatteryCharge=maxBatteryCharge;
        this.currentBatteryCharge=currentBatteryCharge;
    }

    // TODO: Declare some constructors here.



    /**
     * Drain the battery based on the number of filters the battery is powering.
     */
    public void drain() {
        double newCurrentCharge=currentBatteryCharge-6;
        setCurrentBatteryCharge(newCurrentCharge);

        // TODO: Implement this method.

    }

    /*
     * Returns whether the battery is low.
     * The battery is considered to be low, when the current charge is less than
     * 5% of the maximum charge.
     * @return true if battery is low, false otherwise.
     */
    public boolean isLow() {
        if(this.currentBatteryCharge<5){
            return true;
        }
        // TODO: Optionally implement this method, or delete it.

        return false;

    }


    // TODO: Declare some getters and setters here.
    public double getMaxBatteryCharge(){
        return this.maxBatteryCharge;
    }
    public double getCurrentBatteryCharge(){
        return this.currentBatteryCharge;
    }
    public void setCurrentBatteryCharge(double currentBatteryCharge){
        this.currentBatteryCharge= currentBatteryCharge;
    }

}

