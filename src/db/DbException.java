package db;

import java.io.Serializable;

public class DbException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public DbException(String msg) {
		super(msg);
	}

}
