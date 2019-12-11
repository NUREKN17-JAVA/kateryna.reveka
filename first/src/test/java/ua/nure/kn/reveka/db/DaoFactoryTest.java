package ua.nure.kn.reveka.db;

import junit.framework.TestCase;
import ua.nure.kn.reveka.usermanagment.domain.User;

public class DaoFactoryTest extends TestCase {

	public void testGetUserDao() {
			try {
				DaoFactory daoFactory = DaoFactory.getInstance();
				assertNotNull("DaoFactory instance is null", daoFactory);
				Dao Dao = daoFactory.getUserDao();
				assertNotNull("Dao<User> is null", Dao);
			} catch (RuntimeException e) {
				e.printStackTrace();
				fail(e.toString());
			}
	}

}
