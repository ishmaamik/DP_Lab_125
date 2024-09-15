public class BikeRide implements RideType{

    FareCalculator fc;

    public BikeRide(FareCalculator fc){
        this.fc= fc;
    }

    public BikeRide(){

    }

    @Override
    public void capacityCalc() {

    }

    public void matchDriver(){

    }

    @Override
    public double getFare(double distance) {
        return fc.fareCalc(distance);
    }
}
