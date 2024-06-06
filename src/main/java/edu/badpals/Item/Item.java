package edu.badpals.Item;
import java.util.List;

import edu.badpals.offer.Offer;

public interface Item {
    public int getBid();
    public int getAsk();
    public int getSale();
    public void addOffer(Offer offer);
    public List<Offer> offers();
    public void setBid(int bid);
    public void setAsk(int ask);
    public void setSale(int sale);
}