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

    public void requestRide(String ride){
        RideType rt= RideFactory.getRide(ride);
    }

    public void rateDriver(){

    }

    public void makePayment(){

    }

    public void bookTrip()
    {
        Trip trip= new Trip(location);
    }

}
