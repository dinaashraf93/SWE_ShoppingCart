
public class CartItemNotFoundException extends Exception {
	
	String msg;
	

	
public CartItemNotFoundException ()
{
	System.out.print("item not found");
}
public void setMessage(String newMsg) {
	
		msg = newMsg;
		
	}
	public String getMessage() {
		
		return msg;
	}

}
