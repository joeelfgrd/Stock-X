package edu.badpals.offer;

public class Sale implements Offer{
    private String size;
    private Integer sale;

    public Sale(String size, int sale){
        this.sale = sale;
        this.size = size;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value() {
        return this.sale;
    }
    @Override
    public int compareTo(Offer offer) {
        return this.sale.compareTo(offer.value());
    }
    public String toString() {
        return "\t\t" + size() + "\t\t" + value() + "\n";
    }
}
