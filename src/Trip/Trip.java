package Trip;

import Notification.Notification;
import RideType.RideType;
import Users.Rider;
import Users.Driver;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    Rider rider;
    Driver driver;
    String pickupLocation;
    String dropoffLocation;
    RideType rideType;
    String status;
    Double fare;
    Integer distance;
    List<Notification> observers= new ArrayList<>();

    public Trip(Rider rider, String pickupLocation, String dropoffLocation){
        this.rider=rider;
        this.pickupLocation= pickupLocation;
        this.dropoffLocation= dropoffLocation;
    }

    public void setFare(double fare)
    {
        this.fare= fare;
    }

    public void addObserver(Notification observer){
            observers.add(observer);
    }

    public void notifyObservers(String message){
        for(Notification observer: observers){
            observer.sendNotification(message);
    }
}

    public void confirmRide(){
        System.out.println("Ride request confirmed");
        notifyObservers("Ride request confirmed");
    }

    public void driverArrived(){
        System.out.println("Driver arrived");
        notifyObservers("Driver arrived");
    }

    public void startTrip(){
        System.out.println("Trip Started");
        notifyObservers("Trip Started");
    }

    public void completeTrip(){
        System.out.println("Trip Complete");
        notifyObservers("Trip Complete");
    }


}
