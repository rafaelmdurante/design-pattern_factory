package org.academiadecodigo.whiledcards.logistics.creator;

import org.academiadecodigo.whiledcards.logistics.product.*;

/**
 * This class will produce RoadLogistics objects (Trucks)
 */
public class RoadLogistics extends LogisticsFactory {

    @Override
    public Transport createTransport(float weight) {

        Transport roadLogistics;

        if (weight < 800) {
            roadLogistics = new CargoCar();
        } else {
            roadLogistics = new Truck();
        }

        return roadLogistics;

    }

}
