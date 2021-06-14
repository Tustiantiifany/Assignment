public class Bike extends Vechile {
    private String bikeType;

    public Bike (int numWheels, String bikeTypes){
        super(numWheels);
        this.bikeType=bikeTypes;
    }
    public String getBikeType(){
        return bikeType;
    }
    
    
}
