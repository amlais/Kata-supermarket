package kata.market.pricing;

import kata.market.model.Item;

public abstract class Pricing {

    public abstract float calculatePrice(Item item, float numberBought);

}
