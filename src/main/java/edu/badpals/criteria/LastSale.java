package edu.badpals.criteria;
import edu.badpals.Item.Item;
import edu.badpals.offer.Offer;

import java.util.List;


public class LastSale implements Criteria {
    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> salesList = new Sales().checkCriteria(item);

        return salesList.isEmpty()?
                List.of()
                : List.of(salesList.getLast());
    }
}