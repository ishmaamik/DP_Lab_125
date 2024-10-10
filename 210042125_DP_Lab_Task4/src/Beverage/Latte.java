package Beverage;

import Condiment.Condiment;

public class Latte extends Beverage{
    public Latte(Beverage b){
        super(b);
    }

    public Latte(Condiment c){
        super(c);
    }

    public Latte(){

    }
}
