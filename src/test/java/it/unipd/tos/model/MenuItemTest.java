////////////////////////////////////////////////////////////////////
// [Daniele] [Spigolon] [1193290]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class MenuItemTest {

    private static MenuItem menuItem;

    @BeforeClass
    public static void beforeClass() {
        menuItem = new MenuItem(ItemType.Fritti, "Olive Ascolane", 3.50);
    }

    @Test
    public void testGetItemType() {
        assertEquals(ItemType.Fritti, menuItem.getItemType());
    }

    @Test
    public void testGetName() {
        assertEquals("Olive Ascolane", menuItem.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(3.50, menuItem.getPrice(), 0);
    }

}