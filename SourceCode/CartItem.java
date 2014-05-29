
public class CartItem implements ICartItem {

	//private 
		int id;
        int productId;
        int quantity;
        double price;
        
        public CartItem()
        {
        	id = 0;
        	productId=0;
        	quantity = 0;
        	price = 0.0;
        }
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public int getProductID() {
		// TODO Auto-generated method stub
		return productId;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	@Override
	public double getUnitPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public double getTotalCost() {
		// TODO Auto-generated method stub
		return (price*quantity);
	}

	@Override
	public void setId(int id) {
        this.id=id;
		
	}

	@Override
	public void setProductId(int id) {
		// TODO Auto-generated method stub
		this.productId = id;
		
	}

	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		this.quantity= quantity;
	}

	@Override
	public void setUnitPrice(double price) {
		// TODO Auto-generated method stub
		this.price=price;
	}

}
