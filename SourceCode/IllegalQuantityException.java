
public class IllegalQuantityException extends Exception {
	
	String msg;
	
public void setMessage(String newMsg) {
	
		msg = newMsg;
		
	}
	public String getMessage() {
		
		return msg;
	}

}
