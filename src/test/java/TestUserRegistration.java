import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserRegistration {
	UserRegistration user=new UserRegistration("Harshal","Malviya","harshal@gmail.com","91 8446555270");
	@Test
    public void testValidFirstName() {
		assertTrue(user.validFirstName(user.fname));
	}
	@Test
    public void testValidLastName() {
		assertTrue(user.validLastName(user.fname));

	}
	@Test
    public void testValidEmail() {
		assertTrue(user.validEmail(user.email));

	}
	@Test
    public void testValidMobileNumber() {
		assertTrue(user.validMobileNumber(user.mnumber));

	}



}
