package kata.market.pricing;

import kata.market.model.Item;

public class DefaultPricing extends Pricing {
    public float calculatePrice(Item item, float numberBought) {
        return (item.getUnitaryPrice() * numberBought);
    }
}
