package ua.nure.kn.reveka.agent;

import ua.nure.kn.reveka.db.DatabaseException;

public class SearchException extends Exception {
	
	public SearchException(DatabaseException e) {
		// TODO Auto-generated constructor stub
		e.printStackTrace();
	}

}
