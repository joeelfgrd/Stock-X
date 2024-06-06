package edu.badpals.criteria;
import java.util.List;
import edu.badpals.offer.Offer;
import edu.badpals.Item.Item;
public interface Criteria {
    public List<Offer> checkCriteria(Item item);
    
}