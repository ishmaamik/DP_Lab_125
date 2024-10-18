public class SMSNotifier implements INotifier{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: "+message);
    }
}
