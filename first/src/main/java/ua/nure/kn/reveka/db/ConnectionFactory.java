package ua.nure.kn.reveka.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection getConnection() throws DatabaseException;
}
