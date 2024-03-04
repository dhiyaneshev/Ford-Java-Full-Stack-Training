package shopping_cart_test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestShoppingCart {
    private ShoppingCart cart;

    @Before
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testAddProduct() {
        cart.addProduct("Laptop", 1000.0);
        assertFalse(cart.isCartEmpty());
    }

    @Test
    public void testRemoveProductSuccess() {
        cart.addProduct("Smartphone", 500.0);
        cart.addProduct("Laptop", 2000.0);
        cart.removeProduct("Smartphone");
        assertEquals(2000.0, cart.calculateTotalPrice(), 0.0);
    }

    @Test
    public void testRemoveProductUnsuccessful() {
        cart.addProduct("Product1", 10.0);
        cart.addProduct("Product2", 20.0);
        cart.removeProduct("Product3");
        assertFalse(cart.isCartEmpty());
    }

    @Test
    public void testCalculateTotalPrice() {
        cart.addProduct("Smartphone", 500.0);
        cart.addProduct("Laptop", 2000.0);
        assertEquals(2500.0, cart.calculateTotalPrice(), 0.0);
    }

    @Test
    public void testIsCartEmpty() {
        assertTrue(cart.isCartEmpty());
        cart.addProduct("Laptop", 2000.0);
        assertFalse(cart.isCartEmpty());
    }

}