public class BikeFare implements FareCalculator{

    @Override
    public double fareCalc(double distance) {
        double s;
        s= distance * 0.5;
//        System.out.println("fare is "+s);
        return s;
    }
}
