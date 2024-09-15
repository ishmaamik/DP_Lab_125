package Factory;

import Payment.CreditCard;
import Payment.DigitalWallet;
import Payment.PayPal;
import Payment.PaymentStrat;

public class PaymentFactory {

    public PaymentStrat getPay(String paymentType, double amount){
        if (paymentType.equalsIgnoreCase("PayPal")){
            PaymentStrat p= new PayPal();
            p.processPay(amount);
            return p;
        }
        else if(paymentType.equalsIgnoreCase("Credit Card")){
            PaymentStrat p= new CreditCard();
            p.processPay(amount);
            return p;
        }
        else if(paymentType.equalsIgnoreCase("Digital Wallet")){
            PaymentStrat p= new DigitalWallet();
            p.processPay(amount);
            return p;
        }
        else {
            throw new IllegalArgumentException("Invalid type");
        }
    }
}
