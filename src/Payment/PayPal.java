package Payment;

public class PayPal implements PaymentStrat{
    @Override
    public void processPay(double amount) {
        System.out.println("Processing $" + amount + " via PayPal");
    }
}
