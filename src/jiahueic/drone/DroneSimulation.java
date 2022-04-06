package jiahueic.drone;

import java.util.Scanner;

/**
 * A simulation program for simulating the cleaning of bodies of water by
 * FLOAT-E drones.
 *
 * @author: Cheah Jia Huei
 */
public class DroneSimulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read in the configuration from the user.
        System.out.print("Battery size (units): ");
        double maxBattery = scanner.nextDouble();

        System.out.print("Number of filters: ");
        int numFilters = scanner.nextInt();

        System.out.print("Water body size (units): ");
        double waterBodySize = scanner.nextDouble();

        System.out.print("Plastic (%): ");
        double plasticBodyPercentage = scanner.nextDouble();

        System.out.println();

        // TODO: Create the Drone.
        Drone drone=new Drone(maxBattery,numFilters);
        //System.out.println("The number of batteries is: "+drone.getBatterySize());
        Battery battery=new Battery();
        //System.out.println("The current battery charge is: "+battery.getCurrentBatteryCharge());
        //System.out.println("The current max battery charge is: "+battery.getMaxBatteryCharge());
        // TODO: Create the WaterBody.
        WaterBody waterBody=new WaterBody(waterBodySize,plasticBodyPercentage);
        //System.out.println("The water body size is: "+waterBody.getSurfaceSize());
        //System.out.println("The plastic body percentage is: "+waterBody.getPlasticBodyPercentage());

        // TODO: Clean the body of water.
        drone.clean(waterBody,battery,drone);

        scanner.close();

    }

}
