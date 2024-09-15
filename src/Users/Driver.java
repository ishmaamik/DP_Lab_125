package Users;

import RideType.Carpool;
import RideType.RideType;

public class Driver {
    String id;
    String name;
    String VehicleType;
    String location;
    int rating;
    String availability;

    public void acceptRide()
    {
        RideType ride= new Carpool();
    }
}
