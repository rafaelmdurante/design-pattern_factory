package org.academiadecodigo.whiledcards.logistics;

import org.academiadecodigo.whiledcards.logistics.creator.*;

public class Main {

    private static LogisticsFactory logisticsFactory;
    private static float weight;

    public static void main(String[] args) {

        configure();
        runBusinessLogic();

    }

    static void configure() {

        /**
         * Generates a weight for the purchase
         * If weight of purchase is higher than 2 tons, goods will be delivered by Ship
         */
        weight = (float) (Math.random() * 3000);
        System.out.println("Weight: " + String.format("%.2f", weight) + "kg");

        if (weight < 2000) {
            logisticsFactory = new RoadLogistics();
        } else {
            logisticsFactory = new SeaLogistics();
        }

    }

    static void runBusinessLogic() {
        logisticsFactory.planDelivery(weight);
    }

}
