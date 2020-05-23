package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.AmericanoMaker;
import lab.assignment.beforerefactoring.CapuccinoMaker;
import lab.assignment.beforerefactoring.CoffeeMakerTemplate;
import lab.assignment.beforerefactoring.MochaMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate mochaMaker = new MochaMaker();
        mochaMaker.prepareCoffee();

        System.out.println("********************");

        CoffeeMakerTemplate capuccinoMaker = new CapuccinoMaker();
        capuccinoMaker.prepareCoffee();

        System.out.println("********************");

        CoffeeMakerTemplate americanoMaker = new AmericanoMaker();
        americanoMaker.prepareCoffee();

    }

}
