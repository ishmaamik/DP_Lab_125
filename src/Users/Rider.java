package Users;
import Trip.Trip;

import Factory.RideFactory;
import RideType.RideType;

public class Rider {

    String id;
    String name;
    String location;
    Integer rating;
    String preferredPaymentMethod;

    public Rider(String id, String name, String location, Integer rating, String preferredPaymentMethod){
        this.id= id;
        this.name= name;
        this.location= location;
        this.rating= rating;
        this.preferredPaymentMethod= preferredPaymentMethod;
    }

    public Rider()
    {

    }

    public Trip requestRide(String ride, String pickup, String dropoff){

        Trip trip= new Trip(this, pickup, dropoff);

        RideType rt= RideFactory.getRide(ride);

        double s= rt.getFare(10.0);

        System.out.println("Drive from "+pickup+" to "+dropoff);
        System.out.println("Fare is "+ s);

        trip.setFare(s);
        return trip;
    }

    public void rateDriver(){

    }

    public void makePayment(){

    }


}
