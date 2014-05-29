import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.notification.Failure;


public class ShoppingCartTest {

	 /**
     * Test of countItem method, of class Shopping Cart.
     */
	@Test
	public void testCountItems() {
		 System.out.println("Test CountItems");
	      
	        int expectedResult = 3; //update this value when wanted 
			ShoppingCart myCart = new ShoppingCart ();
			ICartItem item = new CartItem();
			myCart.addItem(item);
			item = new CartItem();
			myCart.addItem(item);
			item = new CartItem();
			myCart.addItem(item);

	        int result = myCart.countItems();

	        assertSame(expectedResult, result); 
			}
	////////////////////////////////////////////////
	
	  /**
     * Test of getId method, of class Shopping Cart.
     */
	@Test public void testGetID(){
		
		 System.out.println("getID");
	        ShoppingCart instance = new ShoppingCart();
	        int expectedResult = 0; // change when needed
	        //Set id to any value and check if equivalent or not 
	        int result = instance.getId();
	        assertSame(expectedResult, result);
	    } 
	////////////////////////////////////////////////////////

    /**
     * Test of getSessionID method, of class ShoppingCart.
     */
    @Test
    public void testGetSessionID() {
        System.out.println("getSessionID");
       
        ShoppingCart instance = new ShoppingCart();
        int expectedResult = 0; // change when needed
        //Set id to any value and check if equivalent or not 
        int result = instance.getSessionID();
        assertSame(expectedResult, result);
    } 
	////////////////////////////////////////////////////////////
    /**
     * Test of getCustomerID method, of class ShoppingCart.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        ShoppingCart instance = new ShoppingCart();
        int expectedResult = 0; // change when needed
        //Set id to any value and check if equivalent or not 
        int result = instance.getCustomerID();
        assertSame(expectedResult, result);
    }
    
    ////////////////////////////////////////////////////////////
    /**
     * Test of getItems method, of class Cart.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        ShoppingCart instance = new ShoppingCart();
        ArrayList<ICartItem> expectedResult = new ArrayList<ICartItem>();; //Change value when wanted to check
                                                    // if it's equivalent or not
        ArrayList<ICartItem> result = instance.getItems();
        assertEquals(expectedResult, result);
    }
    
    ////////////////////////////////

    /**
     * Test of getLastAccessedDate method, of class Cart.
     */
    @Test
    public void testGetLastAccessedDate() {
        System.out.println("getLastAccessedDate");
        ShoppingCart instance = new ShoppingCart();
        Date expectedResult = null; //Change value when wanted to check
                               // if it's equivalent or not
        Date result = instance.getLastAccessedDate();
        assertSame(expectedResult, result);
    } 
    ////////////

    /**
     * Test of addItem method, of class Shopping Cart.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ICartItem c = new CartItem();
        ShoppingCart instance = new ShoppingCart();
        instance.addItem(c);
      assertSame(c,instance.itemsArray.get(0));
     
      
    }
    ////////////////////////////////////////////////////////////
    /**
     * Test of updateQuantity method, of class Shopping Cart.
     */
@Test
    public void testUpdateQuantity(){

    System.out.println("Update Quantity");
        ShoppingCart myCart = new ShoppingCart();
    	CartItem item = new CartItem();
    	item.setId(1);
    	item.setProductId(2);
    	item.setQuantity(2);
    	item.setUnitPrice(25);
    	int newQuantity =3 ; //assume any value
    	myCart.addItem(item);
    	myCart.updateQuantity(1, newQuantity);
    	int cartItemID=1;
    	int foundQuantity=0;

        for(int i=0 ; i<myCart.itemsArray.size() ; i++)
        {
        	
        	if(myCart.itemsArray.get(i).getId() == cartItemID)
        	{
        		foundQuantity=myCart.itemsArray.get(i).getQuantity();
        		break;
        	}
               
        }
        assertSame(newQuantity,foundQuantity );
    }
///////////////////////////////////////////////////
/**
 * Test of RemoveItem method, of class Shopping Cart.
 */
@Test
 public void testRemoveItem()
{
    System.out.println("Remove item");

    ShoppingCart myCart = new ShoppingCart();
	CartItem item = new CartItem();
	item.setId(1);
	item.setProductId(2);
	item.setQuantity(2);
	item.setUnitPrice(25);
	int newQuantity =3 ; //assume any value
	myCart.addItem(item);
	myCart.removeItem(1);
	assertSame(0,myCart.itemsArray.size());
}
/////////////////////////////////////////////
/**
 * Test of getItem method, of class Shopping Cart.
 */
@Test
public void testGetItem()
{
    System.out.println("Test function GetItem");

    ShoppingCart myCart = new ShoppingCart();
	CartItem item = new CartItem();
	item.setId(1);
	item.setProductId(2);
	item.setQuantity(2);
	item.setUnitPrice(25);
	myCart.addItem(item);
	CartItem item2 = item;
	assertSame(item2,myCart.getItem(2));
}
	
}
