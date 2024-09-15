package Payment;

public class DigitalWallet implements PaymentStrat{
    @Override
    public void processPay(double amount) {
        System.out.println("Processing " + amount + " via Digital Wallet");
    }
}
