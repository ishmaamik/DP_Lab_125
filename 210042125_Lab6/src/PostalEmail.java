public class PostalEmail {
    LocationAPI locAPI;
    public void send(String message, String LocX, String LocY){
        System.out.println("Sending postal email: "+message+" to coordinates "+LocX+","+LocY);
    };
}
