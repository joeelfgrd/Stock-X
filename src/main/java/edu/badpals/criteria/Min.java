package edu.badpals.criteria;

import edu.badpals.Item.Item;
import edu.badpals.offer.Offer;
import java.util.List;
import java.util.Optional;

public class Min implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> min = new AndCriteria(this.criteria,this.otherCriteria)
                .checkCriteria(item)
                .stream()
                .min(Offer::compareTo);
        return min.isPresent() ? List.of(min.get()) : List.of();
    }
}