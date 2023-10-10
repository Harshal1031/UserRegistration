import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	String fname;
	String lname;
	String email;
	String mnumber;
	String passward;

	public UserRegistration(String fname, String lname, String email, String mnumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mnumber = mnumber;
	}

	public boolean validFirstName(String fname2) {
		Pattern p = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		Matcher ma = p.matcher(fname2);
		if (ma.matches())
			return true;
		else
			return false;
	}

	public boolean validLastName(String fname2) {
		Pattern p = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		Matcher ma = p.matcher(fname2);
		if (ma.matches())
			return true;
		else
			return false;
	}

	public boolean validEmail(String email2) {
		Pattern p = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
		Matcher ma = p.matcher(email2);
		if (ma.matches())
			return true;
		else
			return false;
	}

	public boolean validMobileNumber(String mnumber2) {
		Pattern p = Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
		Matcher ma = p.matcher(mnumber2);
		if (ma.matches())
			return true;
		else
			return false;
	}

}
