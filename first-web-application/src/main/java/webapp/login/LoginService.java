package webapp.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Suresh") && password.equals("welcome1"))
			return true;

		return false;
	}

}