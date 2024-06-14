package edu.badpals.criteria;

import edu.badpals.Item.Item;
import edu.badpals.offer.Bid;
import edu.badpals.offer.Offer;
import java.util.List;

public class Bids implements Criteria {
    public Bids(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(i-> i instanceof Bid)
                .sorted()
                .toList();
    }
}