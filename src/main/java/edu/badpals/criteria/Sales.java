package edu.badpals.criteria;
import edu.badpals.Item.Item;
import edu.badpals.offer.Offer;
import edu.badpals.offer.Sale;

import java.util.List;

public class Sales implements Criteria {
    public Sales(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(i->i instanceof Sale)
                .toList();
    }
}