
public interface ICartItem {
	public int getId();
	public int getProductID();
	public int getQuantity();
	public double getUnitPrice();
	public double getTotalCost();
	public void setId(int id);
	public void setProductId(int id);
	public void setQuantity(int quantity);
	public void setUnitPrice(double price);
}
