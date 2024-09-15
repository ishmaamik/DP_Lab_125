public class Carpool implements RideType{

    FareCalculator fc;

    public Carpool(FareCalculator fc){
        this.fc= fc;
    }

    public Carpool(){

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
