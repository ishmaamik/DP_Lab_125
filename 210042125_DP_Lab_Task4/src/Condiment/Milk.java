package Condiment;

import Beverage.Beverage;

public class Milk extends Condiment{

    public Milk(Condiment c){
        super(c);
    }
    public Milk(){

    }
    public Milk(Beverage b){
        super(b);
    }
}
