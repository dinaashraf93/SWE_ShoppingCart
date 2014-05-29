import static org.junit.Assert.*;

import org.junit.Test;


public class CartItemTesting {

	@Test
	public void testgetTotalCost() {
		CartItem product = new CartItem ();
		product.setId(1);
		product.setProductId(1);
		product.setQuantity(5);
		product.setUnitPrice(10);

		assertEquals(51, product.getTotalCost(),0);
		}

}
