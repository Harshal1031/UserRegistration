import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserRegistration {
	UserRegistration user=new UserRegistration("Harshal","Malviya","harshal@gmail.com","8446555270");
	@Test
    public void testValidFirstName() {
		assertTrue(user.validFirstName(user.fname));
	}
	@Test
    public void testValidLastName() {
		assertTrue(user.validLastName(user.fname));

	}

}
