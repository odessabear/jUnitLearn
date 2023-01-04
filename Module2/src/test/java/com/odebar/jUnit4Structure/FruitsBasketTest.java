package com.odebar.jUnit4Structure;

import static org.junit.Assert.assertEquals;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FruitsBasketTest {

    private FruitsBasket basket = new FruitsBasket();
    private Fruit apple = new Fruit("Apple", 120);
    private Fruit orange = new Fruit("Orange", 120);
    private Fruit pear = new Fruit("Pear", 120);

    @Before
    public void init() {
        basket.add(apple);
        basket.add(orange);
        basket.add(pear);
    }

    @Test
    public void testSize() {
        assertEquals("Checking basket's size", 3, basket.getSize());
    }

    @Test
    public void testAdd() {
        basket.add(new Fruit("Banana", 200));
        assertEquals("Adding one more fruit to the basket", 4, basket.getSize());
    }

    @Test
    public void testRemove() {
        basket.remove(orange);
        assertEquals("Removing a fruit from the basket", 2, basket.getSize());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveException() {
        basket.remove(new Fruit("Kiwi", 80));
        assertEquals("Removing a fruit from the basket", 2, basket.getSize());
    }

    @After
    public void destroy() {
        basket.removeAll();
    }
}
