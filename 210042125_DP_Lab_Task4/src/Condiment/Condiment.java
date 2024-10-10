package Condiment;

import Beverage.Beverage;

public class Condiment {

    public Condiment(Condiment c){
        System.out.println("added "+c.getClass().getSimpleName()+" to "+this.getClass().getSimpleName());
    }

    public Condiment(){

    }

    public Condiment(Beverage b){
        System.out.println("added "+b.getClass().getSimpleName()+" to "+this.getClass().getSimpleName());
    }


}
