package org.academiadecodigo.whiledcards.logistics.creator;

import org.academiadecodigo.whiledcards.logistics.product.*;

/**
 * This class will produce SeaLogistics objects (Ships)
 */
public class SeaLogistics extends LogisticsFactory {

    @Override
    public Transport createTransport(float weight) {
        return new Ship();
    }

}
