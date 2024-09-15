package Fare;

public class CarpoolFare implements FareCalculator{

    @Override
    public double fareCalc(double distance) {
        double s;
        s= distance * 2.0;
//        System.out.println("fare is "+s); No need as Users.Rider has requestRide
        return s;
    }

}
