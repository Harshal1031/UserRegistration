import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	String fname;
	String lname;
	String email;
	String mnumber;
	String passward;
	public UserRegistration() {
		super();
	}


	public UserRegistration(String fname, String lname, String email, String mnumber,String passward) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mnumber = mnumber;
		this.passward=passward;
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
        Pattern pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3,}$");
        Matcher matcher = pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}-[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email2);
          if (matcher.matches()){
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email2);
         if (matcher.matches()){
            return true;
        }
         pattern = Pattern.compile("^[a-z0-9]{2,}@[a-z]{3}.[a-z]{2,}$");
         matcher = pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }
         pattern = Pattern.compile("^[a-z]{2,}-[0-9]{2,}@[a-z]{2,}.[a-z]{2,}");
         matcher= pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }
         pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}$");
         matcher = pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3}.[a-z]{3}$");
         matcher = pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }
         pattern = Pattern.compile("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}");
         matcher = pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }
         pattern = Pattern.compile("^[a-z]{2,}@[0-9]{1,}.[a-z]{2,}$");
         matcher = pattern.matcher(email2);
        if (matcher.matches()){
            return true;
        }

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

	public boolean validPassward(String passward2) {
        Pattern p = Pattern.compile("^[a-z]{8,}$");
		Matcher ma = p.matcher(passward2);
		if (ma.matches())
			return true;
		else
			return false;
	}
	public boolean validPassward2(String passward2) {
        Pattern p = Pattern.compile("\"[a-z]{7,}[A-Z]{1,}\"");
		Matcher ma = p.matcher(passward2);
		if (ma.matches())
			return true;
		else
			return false;
	}
	public boolean validPassward3(String passward2) {
        Pattern p = Pattern.compile("\"[a-z]{7,}[A-Z]{1,}[0-9]{1,}\"");
		Matcher ma = p.matcher(passward2);
		if (ma.matches())
			return true;
		else
			return false;
	}
	public boolean validPassward4(String passward2) {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
	
		Matcher ma = p.matcher(passward2);
		if (ma.matches())
			return true;
		else
			return false;
	}


}
