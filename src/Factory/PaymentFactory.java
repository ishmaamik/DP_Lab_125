package Factory;

import Payment.CreditCard;
import Payment.DigitalWallet;
import Payment.PayPal;
import Payment.PaymentStrat;

public class PaymentFactory {

    public PaymentStrat getPay(String paymentType){
        if (paymentType.equalsIgnoreCase("PayPal")){
            return new PayPal();
        }
        else if(paymentType.equalsIgnoreCase("Credit Card")){
            return new CreditCard();
        }
        else if(paymentType.equalsIgnoreCase("Digital Wallet")){
            return new DigitalWallet();
        }
        else {
            throw new IllegalArgumentException("Invalid type");
        }
    }
}
