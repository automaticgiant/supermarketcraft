package edu.vt.hokie.main;

import edu.vt.hokie.model.SaleType;
import edu.vt.hokie.model.ShoppingCart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

/**
 * Created by lxc686 on 2/17/17.
 */
public class ShoppingCartTest {
    ShoppingCart            cart;
    List<String>            itemList;
    Map<String, Integer>    quantityMap;
    Map<String, Double>     priceMap;
    Map<String, SaleType>   saleMap;

    @Before
    public void setUpStreams() {
        cart = new ShoppingCart();
        cart.initializeItem("APPLE", 1);
        cart.initializeItem("ORANGE", 2);
        cart.initializeItem("BANANA", 1.50);
        cart.initializeItem("PEACH", 2.99);

        itemList = cart.getItems();
        quantityMap = cart.getQuantityMap();
        priceMap = cart.getPriceMap();
        saleMap = cart.getSaleMap();
    }

    @Test
    public void testInitItem() {
        cart.initializeItem("APPLE", 2);
        assertEquals(priceMap.get("APPLE"), (Double)1.0);
    }

    @Test
    public void testApplySale() {
        cart.applySale("APPLE", "BOGO");
        assertEquals(saleMap.get("APPLE"), SaleType.BOGO);

        cart.applySale("NOTHING", "BOGO");
        assertFalse(saleMap.containsKey("NOTHING"));

        cart.applySale("APPLE", "NOTHING");
        assertEquals(saleMap.get("APPLE"), SaleType.NO);
    }

    @Test
    public void testAddItem() {
        cart.addItem("APPLE", 1);
        assertEquals(quantityMap.get("APPLE"), (Integer)1);

        cart.addItem("NOTHING", 1);
        assertFalse(quantityMap.containsKey("NOTHING"));
    }

    @Test
    public void testRemoveItem() {
        cart.removeItem("APPLE", 1);
        assertEquals(quantityMap.get("APPLE"), (Integer)0);

        cart.removeItem("NOTHING", 1);
        assertFalse(quantityMap.containsKey("NOTHING"));

        quantityMap.put("APPLE", 1);
        cart.removeItem("APPLE", 3);
        assertEquals(quantityMap.get("APPLE"), (Integer)0);
    }

    @Test
    public void testCalculate() {
        quantityMap.put("APPLE", 5);
        quantityMap.put("ORANGE", 3);
        quantityMap.put("BANANA", 1);
        quantityMap.put("PEACH", 1);
        
        assertEquals((Double)cart.printCartAndSubtotal(), (Double)15.49);
    }
    
    @Test 
    public void testCalculateBOGO() {
    	// example of how to set a BOGO sale on item "APPLE"
    	// saleMap.put("APPLE", SaleType.BOGO);
    	
    	assertTrue(true);
    }
    
    @Test
    public void testCalculateBOGOHO() {
    	// example of how to set a BOGOHO sale on item "APPLE"
    	// saleMap.put("APPLE", SaleType.BOGOHO);
    	
    	assertTrue(true);
    }
    
    @Test
    public void testCalculateThree4Two() {
    	// example of how to set a BOGOHO sale on item "APPLE"
    	// saleMap.put("APPLE", SaleType.THREE4TWO);
    	
    	assertTrue(true);
    }
}
