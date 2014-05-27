
public class SqlException extends PersistenceException {
	
	String msg;
	public void setMessage(String newMsg) {
		
		msg = newMsg;
	}
	public String getMessage() {
		
		return msg;
	}

}

