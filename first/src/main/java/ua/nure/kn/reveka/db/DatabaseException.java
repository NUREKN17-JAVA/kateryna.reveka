package ua.nure.kn.reveka.db;

@SuppressWarnings("serial")
public class DatabaseException extends Exception {

	public DatabaseException(Exception e) {
		super(e);
	}

	public DatabaseException(String string) {
		super(string);
	}

}
