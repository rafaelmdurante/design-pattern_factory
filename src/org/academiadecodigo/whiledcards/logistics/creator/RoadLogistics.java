package org.academiadecodigo.whiledcards.logistics.creator;

import org.academiadecodigo.whiledcards.logistics.product.*;

/**
 * This class will produce RoadLogistics objects (Trucks)
 */
public class RoadLogistics extends LogisticsFactory {

    @Override
    public Transport createTransport() {

        return new Truck();

    }

}
