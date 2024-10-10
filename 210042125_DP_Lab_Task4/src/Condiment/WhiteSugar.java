package Condiment;

import Beverage.Beverage;

public class WhiteSugar extends Condiment{
    public WhiteSugar(){

    }

    public WhiteSugar(Condiment c){
        super(c);
    }

    public WhiteSugar(Beverage b){
        super(b);
    }
}
