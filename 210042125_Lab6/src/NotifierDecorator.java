public class NotifierDecorator implements INotifier{
    INotifier notifier;


    public NotifierDecorator(INotifier notifier){
        this.notifier= notifier;
    }
    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
