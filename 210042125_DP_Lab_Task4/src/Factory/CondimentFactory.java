package Factory;

import Condiment.Condiment;
import Condiment.Milk;
import Condiment.WhiteSugar;
import Condiment.WhippedCream;

public class CondimentFactory {
    public Condiment createCondiment(String a, int cost){
        if (a.equalsIgnoreCase("Milk")){
            cost+=10;
            return new Milk();
        }
        else if(a.equalsIgnoreCase("Whipped Cream")){
            cost+=15;
            return new WhippedCream();
        }
        else if(a.equalsIgnoreCase("White sugar")){
            cost+= 20;
            return new WhiteSugar();
        }
        else{
            throw new IllegalArgumentException("Condiment not found");
        }
    }
}
