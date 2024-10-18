public class FacebookNotifier extends NotifierDecorator{

    public FacebookNotifier(INotifier notifier) {
        super(notifier);    //this.notifier= notifier so no need for
                            //separately assigning variable
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebook(message);
    }

    public void sendFacebook(String message){
        System.out.println("Sending Facebook notification: " +message);
    }
}
