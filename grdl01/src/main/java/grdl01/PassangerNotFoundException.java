package grdl01;

import java.util.function.Supplier;

public class PassangerNotFoundException extends Exception implements Supplier {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PassangerNotFoundException(String message) {
		super(message);
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

}
