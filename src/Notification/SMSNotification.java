package Notification;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("sending SMS: "+ message);
    }
}
