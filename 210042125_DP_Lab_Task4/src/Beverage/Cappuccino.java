package Beverage;

import Condiment.Condiment;

public class Cappuccino extends Beverage{
    public Cappuccino(Beverage b){
        super(b);
    }

    public Cappuccino(Condiment c){
        super(c);
    }

    public Cappuccino(){

    }
}
