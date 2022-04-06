package jiahueic.drone;

/**
 * A class for representing a body of water that is to be cleaned.
 *
 * @author : Cheah Jia Huei
 */
public class WaterBody {
    private double surfaceSize;
    private double plasticSurfaceSize;
    private double plasticBodyPercentage;// this part is still in percent
    // put the plastic body percentage in decimal rather than percentage format
    // in the constructor
    // TODO: Declare some instance variables here.

    public WaterBody(double surfaceSize, double plasticBodyPercentage){
        this.surfaceSize=surfaceSize;
        this.plasticBodyPercentage=plasticBodyPercentage/100;
        this.plasticSurfaceSize=plasticBodyPercentage/100*surfaceSize;
    }


    // TODO: Declare some constructors here.



    /**
     * Takes a step to clean the body of water, for a single filter.
     */
    public void clean(Drone drone) {
        int numFilter=drone.getNumberofFilters();
        for(int i=0;i<numFilter;i++){
            double surfacePlasticReduced=(0.5+(this.plasticSurfaceSize/this.surfaceSize))/this.surfaceSize;
            //System.out.println("The surface plastic reduced is:" +surfacePlasticReduced);
            double newPlasticBodyPercentage=this.plasticBodyPercentage-surfacePlasticReduced;
            //System.out.println("The new plastic body percentage is:" +newPlasticBodyPercentage);
            setPlasticBodyPercentage(newPlasticBodyPercentage);
            double newPlasticSurfaceSize=newPlasticBodyPercentage*surfaceSize;
            setPlasticSurfaceSize(newPlasticSurfaceSize);

        }

        // TODO: Implement this method.

    }

    /**
     * Returns whether or not the body of water is now considered clean.
     * A body of water is considered clean, when the plastic covers
     * less than 0.05 of the water surface.
     * @return true if the water body is clean, false otherwise
     */
    public boolean isClean() {
        if(this.plasticBodyPercentage<0.05){
            return true;
        }
        // TODO: Optionally implement this method, or delete it.

        return false;

    }

    public double getSurfaceSize(){
        return this.surfaceSize;
    }
    // TODO: Declare some getters and setters here.
    public double getPlasticSurfaceSize(){
        return this.plasticSurfaceSize;
    }
    public double getPlasticBodyPercentage(){
        return this.plasticBodyPercentage;
    }
    public void setSurfaceSize(double surfaceSize){
        this.surfaceSize=surfaceSize;
    }
    public void setPlasticSurfaceSize(double plasticSurfaceSize){
        this.plasticSurfaceSize=plasticSurfaceSize;
    }
    public void setPlasticBodyPercentage(double plasticBodyPercentage){
        this.plasticBodyPercentage=plasticBodyPercentage;
    }

}
