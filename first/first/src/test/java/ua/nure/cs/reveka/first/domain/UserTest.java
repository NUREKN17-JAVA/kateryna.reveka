package ua.nure.cs.reveka.first.domain;

import java.util.Calendar;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	private static final int CURRENT_YEAR = 2019;
	private static final int YEAR_OF_BIRTH = 2001;



	private static final int ETALON_AGE = 18;
	private static final int DAY_OF_BIRTH = 27;
	private static final int MONTH_OF_BIRTH = 2;
	
	private static final int DAY_OF_BIRTH_1 = 14;
	private static final int MONTH_OF_BIRTH_1 = 10;
	private static final int ETALONE_AGE_1 = 18;
	
	private static final int MONTH_OF_BIRTH_2 = 10;
	private static final int ETALONE_AGE2 = 17;
	private static final int DAY_OF_BIRTH_2 = 15;
	
	private static final int DAY_OF_BIRTH_3 = 13;
	private static final int MONTH_OF_BIRTH_3 = 10;
	private static final int ETALON_AGE_3 = 18;
	
	private static final int DAY_OF_BIRTH_4 = 15;
	private static final int MONTH_OF_BIRTH_4 = 11;
	private static final int ETALON_AGE_4 = 17;

	
	private User user;
	
	public void testGetFullName() {
		user.setFirstName("Josh");
		user.setLastName("Doe");
		assertEquals("Doe","Josh", user.getFullName());
	
	}
    public void testGetAge() {
    	Calendar calendar =  Calendar.getInstance();
    	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
      	user.setDateOfBirth(calendar.getTime());
      	assertEquals(ETALON_AGE, user.getAge());
    }
    public void testGetAge1() {
    	Calendar calendar =  Calendar.getInstance();
    	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_1, DAY_OF_BIRTH_1);
      	user.setDateOfBirth(calendar.getTime());
      	assertEquals(ETALON_AGE_1, user.getAge());
    }
    public void testGetAge2() {
    	Calendar calendar =  Calendar.getInstance();
    	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_2, DAY_OF_BIRTH_2);
      	user.setDateOfBirth(calendar.getTime());
      	assertEquals(ETALON_AGE_2, user.getAge());
    }
    public void testGetAge3() {
    	Calendar calendar =  Calendar.getInstance();
    	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_3, DAY_OF_BIRTH_3);
      	user.setDateOfBirth(calendar.getTime());
      	assertEquals(ETALON_AGE_3, user.getAge());
    }
    public void testGetAge4() {
    	Calendar calendar =  Calendar.getInstance();
    	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_4, DAY_OF_BIRTH_4);
      	user.setDateOfBirth(calendar.getTime());
      	assertEquals(ETALON_AGE_4, user.getAge());
    }
    
	protected void setUp() throws Exception {
		super.setUp();
		user=new User();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
