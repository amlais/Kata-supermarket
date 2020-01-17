package kata.market.model;
import java.util.LinkedHashMap;

import static io.vavr.API.*;

class Customer {
    private Supermarket supermarket;
    private LinkedHashMap<Item, Float> cart = new LinkedHashMap();
    
    public LinkedHashMap<Item, Float> getCart(){
    	return cart;
    }
    
    void addToCart(Item item, float numberToBuy) {
        if (cart.containsKey(item)) {
            if(item.isByWeight() && (numberToBuy - (int) numberToBuy) != 0)
            {
                throw new RuntimeException("Error case: you cannot buy half an item !");
            }
            else
            {
                cart.put(item, numberToBuy + (Float) cart.get(item));
            }
        }
        else
        {
            cart.put(item, numberToBuy);
        }
    }

    void removeFromCart(Item item, float number) {
        if (cart.containsKey(item))
        {
            Match((Float) cart.get(item) - number).of(
                    Case($(n -> n > 0), () -> cart.replace(item, (Float) cart.get(item) - number)),
                    Case($(), () -> cart.remove(item)));
        }
    }

}

