public class LuxuryRide implements RideType{

    FareCalculator fc;

    public LuxuryRide(FareCalculator fc){
        this.fc= fc;
    }

    public LuxuryRide()
    {

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
