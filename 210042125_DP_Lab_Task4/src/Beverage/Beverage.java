package Beverage;

import Condiment.Condiment;
import Condiment.Milk;
import Condiment.Milk;
import Condiment.Milk;
import Factory.CondimentFactory;

public class Beverage {
    int total_cost=90;
    public void addCondiment(String c){
        CondimentFactory cf= new CondimentFactory();
        Condiment a= cf.createCondiment(c);
        System.out.println("Condiment"+c+"added to Beverage and total cost is "+ total_cost);
    }

    public Beverage(Beverage b){
        System.out.println("added "+b.getClass().getSimpleName()+" to "+this.getClass().getSimpleName());
    }

    public Beverage(Condiment c){
        System.out.println("added "+c.getClass().getSimpleName()+" to "+this.getClass().getSimpleName());
    }
    public Beverage(){

    }

}
