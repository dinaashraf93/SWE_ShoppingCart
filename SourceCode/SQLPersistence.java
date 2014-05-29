import java.util.ArrayList;


public class SQLPersistence implements IPersistenceMechanism {
	
	ShoppingCart cart = new ShoppingCart();
	ArrayList<ICartItem> items = new ArrayList<ICartItem>();
	
	CartItem item1 = new CartItem();
	CartItem item2 = new CartItem();
	CartItem item3 = new CartItem();
	
	public void setCartItems(){
		
		item1.price = 254;
		item1.productId = 5;
		item1.quantity = 4;
		
		item2.price = 23.5;
		item2.productId = 4;
		item2.quantity = 10;
		
		item3.price = 500;
		item3.productId = 6;
		item3.quantity = 2;
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		
		
	}
	
	public void setCart(){
	cart.customerId = 1;
	cart.sessionId = 20;
	cart.itemsArray = items;
	}
	

	@Override
	public void save(IShoppingCart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IShoppingCart loadCart(int cartID) {
		// TODO Auto-generated method stub
		
		
		return cart;
		
	}

	@Override
	public IShoppingCart createCart(int sessionID, int customerID) {
		// TODO Auto-generated method stub
		ShoppingCart  C = new ShoppingCart();
		
		return C;
	}

	@Override
	public IShoppingCart loadCart(int sessionID, int customerID) {
		
	
		return cart;
	}

	@Override
	public void removeCart(IShoppingCart cart) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public IPersistenceMechanism getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
