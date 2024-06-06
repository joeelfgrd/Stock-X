package edu.badpals.Item;

import java.util.ArrayList;
import java.util.List;

import edu.badpals.offer.Offer;
import lombok.Data;

@Data
public class Sneaker implements Item {
    public List<Offer> offers = new ArrayList<>();
    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;
    public Sneaker(String style,String name){
        this.name = name;
        this.style = style;
    }

    public int getAsk() {
        return ask;
    }

    public int getBid() {
        return bid;
    }

    public int getSale() {
        return sale;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return getStyle() + "\n\t\t" + getName();
    }
    @Override
    public void addOffer(Offer offer){
        offers.add(offer);
    }
    public List<Offer> offers(){
        return this.offers;
    }

    
}