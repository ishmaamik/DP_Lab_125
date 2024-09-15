import Notification.EmailNotification;
import Notification.InAppNotification;
import Trip.Trip;
import Users.Rider;

public class Main {
    public static void main(String[] args) {
        Rider r= new Rider();
        r.requestRide("Luxury", "Dhanmondi", "Gulshan");

        EmailNotification em= new EmailNotification();
        InAppNotification in= new InAppNotification();
        Trip trip= new Trip(r, "Dhanmondi", "Gulshan");
        trip.addObserver(em);
        trip.addObserver(in);

        trip.confirmRide();



    }
}