public class Trip {
    String id;
    String pickupLocation;
    String dropoffLocation;
    RideType rideType;
    String status;
    Integer fare;
    Integer distance;

    public Trip(String pickupLocation){
        this.pickupLocation= pickupLocation;
    }
}
