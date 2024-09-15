public class LuxuryFare implements FareCalculator{

    @Override
    public double fareCalc(double distance) {
        double s;
        s= distance * 3.0;
//        System.out.println("fare is "+s);
        return s;
    }
}
