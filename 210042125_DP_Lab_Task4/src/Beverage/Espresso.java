package Beverage;

import Condiment.Condiment;

public class Espresso extends Beverage{
        public Espresso(Beverage b){
            super(b);
        }

    public Espresso(Condiment c){
        super(c);
    }

    public Espresso(){

    }
}
