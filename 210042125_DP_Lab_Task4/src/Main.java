import Beverage.Beverage;
import Condiment.Milk;
import Condiment.WhippedCream;
import Condiment.WhiteSugar;
import Factory.CondimentFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CondimentFactory cf= new CondimentFactory();
       Scanner j= new Scanner(System.in);
       int i= j.nextInt();

        switch (i) {
            case 1:
               cf.createCondiment("Milk over Sugar");
               break;
            case 2:
                cf.createCondiment("Sugar over Milk");
                break;
            case 3:
                cf.createCondiment("Milk over Cream over Espresso");
                break;
        }
    }
}
