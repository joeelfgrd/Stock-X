package edu.badpals.criteria;
import edu.badpals.offer.Offer;
import edu.badpals.Item.Item;
import edu.badpals.offer.Ask;
import java.util.List;

public class Asks implements Criteria {
    public Asks(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(i->i instanceof Ask)
                .sorted()
                .toList();
    }
}