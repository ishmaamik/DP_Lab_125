package Payment;

public class CreditCard implements PaymentStrat{
    @Override
    public void processPay(double amount) {
        System.out.println("Processing $" + amount + " via Credit card");
    }
}
