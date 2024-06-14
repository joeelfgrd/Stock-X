package edu.badpals;

import edu.badpals.Item.Sneaker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class StockxTest {
    @Test
    public void testAppHasADraw() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull("app debe tener un draw", Stockx.draw(sneaker));
    }
}