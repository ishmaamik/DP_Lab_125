package Factory;

import Beverage.Beverage;
import Beverage.Espresso;
import Beverage.Latte;
import Beverage.Cappuccino;

public class BeverageFactory {
    public Beverage createCondiment(String a){
        if (a.equalsIgnoreCase("Espresso")){
            return new Espresso();
        }
        else if(a.equalsIgnoreCase("Latte")){
            return new Latte();
        }
        else if(a.equalsIgnoreCase("Cappuccino")){
            return new Cappuccino();
        }
        else{
            throw new IllegalArgumentException("Beverage not found");
        }
    }
}
