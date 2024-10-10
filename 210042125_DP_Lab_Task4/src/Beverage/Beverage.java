package Beverage;

import Condiment.Condiment;

public class Beverage {

    public Beverage(Beverage b){
        System.out.println("added "+b.getClass().getSimpleName()+" to "+this.getClass().getSimpleName());
    }

    public Beverage(Condiment c){
        System.out.println("added "+c.getClass().getSimpleName()+" to "+this.getClass().getSimpleName());
    }
    public Beverage(){

    }

}
