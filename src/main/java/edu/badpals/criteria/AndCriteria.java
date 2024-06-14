package edu.badpals.criteria;

import edu.badpals.Item.Item;
import edu.badpals.offer.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return criteria.checkCriteria(item).stream()
                .filter(i->otherCriteria.checkCriteria(item).contains(i))
                .collect(Collectors.toList());
    }
}