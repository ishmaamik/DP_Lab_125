package Notification;

public class InAppNotification implements Notification{

    @Override
    public void sendNotification(String message) {
        System.out.println("sending InApp message: "+message);
    }
}
