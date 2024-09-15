package Notification;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification(String message) {
        System.out.println("sending Email: "+message);
    }
}
