import java.util.ArrayList;
import java.util.Date;


public interface IShoppingCart {

	public int getId();
	public int getSessionID();
	public int getCustomerID();
	public void addItem(ICartItem item);
	public void updateQuantity(int cartItemID , int newQuantity) throws CartItemNotFoundException;
	public void removeItem(int cartItemID) throws CartItemNotFoundException;
	public ICartItem getItem(int productID) throws CartItemNotFoundException;
	public ArrayList<ICartItem> getItems();
	public int countItems();
	public Date getLastAccessedDate();
}
