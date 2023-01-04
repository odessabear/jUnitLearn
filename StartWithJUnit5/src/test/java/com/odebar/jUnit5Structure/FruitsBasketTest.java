package com.odebar.jUnit5Structure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class FruitsBasketTest {

    private FruitsBasket basket = new FruitsBasket();
    private Fruit apple = new Fruit("Apple", 120);
    private Fruit orange = new Fruit("Orange", 120);
    private Fruit pear = new Fruit("Pear", 120);

    @BeforeEach
    public void init() {
        basket.add(apple);
        basket.add(orange);
        basket.add(pear);
    }

//    @Test
//    void testSize() {
//        assertEquals(3, basket.getSize(), "Checking basket's size");
//    }
//
//    @Test
//    void testAdd() {
//        basket.add(new Fruit("Banana", 200));
//        assertEquals(4, basket.getSize(), "Adding one more fruit to the basket");
//    }
//
//    @Test
//    void testRemove() {
//        basket.remove(orange);
//        assertEquals(2, basket.getSize(), "Removing a fruit from the basket");
//    }
//
//    @Test
//    void testRemoveException() {
//        assertThrows(NoSuchElementException.class,
//                () -> basket.remove(new Fruit("Kiwi", 80)), "Removing a fruit from the basket");
//    }
//
//    @Test
//    void testForTimeout() {
//        assertTimeout(Duration.ofMillis(100),
//                () -> Thread.sleep(10),
//                () -> "Testing for productivity"
//        );
//    }

//    @Test
//    void testForNull() {
//        basket = null;
//        assertNull(basket, "Checking if the basket is null.");
//    }

    @Test
    void testForTruth() {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("Peach", 100),
                new Fruit("Tangerine", 50),
                new Fruit("Mango", 150)
        );
        assertTrue(basket.addALot(fruitList), "Adding a lot of fruits");
    }

    @AfterEach
    void destroy() {
        basket.removeAll();
    }
}
