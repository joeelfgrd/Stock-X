package edu.badpals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import edu.badpals.Item.Sneaker;
import edu.badpals.offer.Offer;
import edu.badpals.offer.Ask;
import edu.badpals.offer.Bid;



public class SneakerTest {

    @Test
    public void constructorTest() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        assertNotNull(sneaker);
        assertEquals("555088-105", sneaker.getStyle());
        assertEquals("Jordan 1", sneaker.getName());
    }

    @Test
    public void addOfferOfferBid() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Bid bid = new Bid("9.5", 282);
        sneaker.addOffer(bid);
        assertEquals(1, sneaker.offers().size());
    }
    @Test
    public void addOfferOfferAsk() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Ask ask = new Ask("15", 288);
        sneaker.addOffer(ask);
        sneaker.addOffer(new Ask("13", 333));
        sneaker.addOffer(new Ask("14", 340));
        sneaker.addOffer(new Ask("13", 341));
        assertEquals(4, sneaker.offers().size());
    }

    @Test
    public void addOfferOffer() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.addOffer(new Bid("9.5", 282));
        sneaker.addOffer(new Ask("15", 288));
        Offer ask = new Ask("13", 333);
        sneaker.addOffer(ask);
        assertEquals(3, sneaker.offers().size());
    }

    public static class BidTest {

        @Test
        public void constructorTest() {
            Bid bid = new Bid("9.5", 282);
            assertEquals(282, bid.value());
            assertEquals("9.5", bid.size());
        }

    }
}