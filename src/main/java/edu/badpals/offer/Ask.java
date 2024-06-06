package edu.badpals.offer;

public class Ask implements Offer{
    private String size;
    private Integer ask;

    public Ask(String size, int ask){
        this.ask = ask;
        this.size = size;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value() {
        return this.ask;
    }
    @Override
    public int compareTo(Offer offer) {
        return this.ask.compareTo(offer.value());
    }
    public String toString() {
        return "\t\t" + size() + "\t\t" + value() + "\n";
    }
}
