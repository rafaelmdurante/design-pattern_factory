package org.academiadecodigo.whiledcards.logistics.creator;

import org.academiadecodigo.whiledcards.logistics.product.*;

/**
 * Base Factory class.
 */
public abstract class LogisticsFactory {

    public void planDelivery(float weight) {

        Transport transport = createTransport(weight);
        transport.deliverGoods();

    }

    /**
     * SubClasses must override this method in order to create specific transport objects
     * @return
     */
    public abstract Transport createTransport(float weight);
}
