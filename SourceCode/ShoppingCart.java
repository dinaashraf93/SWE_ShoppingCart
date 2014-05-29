import java.util.ArrayList;
import java.util.Date;


public class ShoppingCart implements IShoppingCart {

	//private 
		
		int id ;
	    int sessionId;
	    int customerId;
	    ArrayList<ICartItem> itemsArray;
	    Date lastAccessed;
	    
	    public ShoppingCart(){
	    	
	    	id=0;
	    	sessionId=0;
	    	customerId = 0;
	    	itemsArray = new ArrayList<ICartItem>(20);
	    	
	    	//lastAccessed = null;
	    	
	    }
	    
		@Override
		public int getId() {
			return id;
		}
		
		
		
		public int getSessionID(){
			return sessionId;
		}
		
		@Override
		public int getCustomerID() {
			
			return customerId;	
		}
		
		public void addItem(ICartItem item) {
         itemsArray.add(item);
			
		}
		
		
		public void updateQuantity(int cartItemID, int newQuantity) throws CartItemNotFoundException {
			boolean b = false;
          try{
            for(int i=0 ; i<itemsArray.size() ; i++)
            {
            	
            	if(itemsArray.get(i).getId() == cartItemID)
            	{
            		itemsArray.get(i).setQuantity(newQuantity);
            		return ;
            	}
	               
            }
            if(b==false){throw new  CartItemNotFoundException();}
          }catch(CartItemNotFoundException C){C.printStackTrace();}
			
		}
		public void removeItem(int cartItemID) throws CartItemNotFoundException {
			boolean b = false;
			try{
				
			for(int i=0 ; i<itemsArray.size() ; i++)
            {
            	
            	if(itemsArray.get(i).getId() == cartItemID)
            	{
            		itemsArray.remove(i);
            		b = true;
            		return ;
            	}
	               
            }
			if(b==false){throw new  CartItemNotFoundException();}
			}catch(CartItemNotFoundException C){
				C.printStackTrace();
			}
			
		}
		
		public ICartItem getItem(int productID)  throws CartItemNotFoundException{
		boolean b = false;
			try{
			for(int i=0 ; i<itemsArray.size() ; i++)
            {
				System.out.print(itemsArray.get(i).getId());
            	
            	if(itemsArray.get(i).getProductID() == productID)
            	{
            		
            		ICartItem cartitem = itemsArray.get(i);
            		b=true;
            		return cartitem;
            	}
	               
            }
			if(b==false){throw  new  CartItemNotFoundException();}}
			
			catch(CartItemNotFoundException C)
			{
				C.printStackTrace();
			}
			return null;
		}
		
		
		public ArrayList<ICartItem>getItems() {
			return  itemsArray;
			// check the return value
		}
		
		
		public int countItems() {
			return itemsArray.size();
		}
		
		public Date getLastAccessedDate() {
			return lastAccessed;
			
		}



}
