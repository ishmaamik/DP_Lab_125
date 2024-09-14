public class RideFactory {

    public static RideType getRide(String ride)
    {
        if (ride.equalsIgnoreCase("Carpool")) {
            System.out.println("Car ride on!");
            return new Carpool();
        }
        else if(ride.equalsIgnoreCase("Luxury")) {
            System.out.println("Luxury ride on!");
            return new LuxuryRide();
        }
        else if(ride.equalsIgnoreCase("Bike")) {
            System.out.println("Bike ride on!");
            return new BikeRide();
        }
        else  {
            throw new IllegalArgumentException("Invalid ride type requested");
        }
    }
}
