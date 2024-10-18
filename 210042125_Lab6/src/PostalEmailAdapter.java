public class PostalEmailAdapter implements INotifier{
    LocationAPI locAPI;
    PostalEmail pm;
    INotifier in;

    public PostalEmailAdapter(LocationAPI locAPI, PostalEmail pm){
        this.locAPI= locAPI;
        this.pm= pm;
        this.in= in;
           }
    @Override
    public void send(String message) {
        String locX= locAPI.x;
        String locY= locAPI.y;
        pm.send(message, locX, locY);
    }
}
