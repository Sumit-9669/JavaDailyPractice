package day5_oops_Basics;

/*🧪 Real-World QA Example: Method Overloading in Test Automation

Imagine you are writing a Test Utility class to verify login functionality.
Sometimes you test with username & password, sometimes with username, password & OTP, and sometimes with username, password & security question.

Instead of writing different method names (loginWithPassword, loginWithOTP, etc.),
👉 You use method overloading → same method name login() but with different parameters.*/
class LoginUtility {

	// Login with username and password
	void login(String username, String password) {
		System.out.println("logging in with username: " + username + " and password: " + password);
	}

	// Login with username, password and OTP
	void login(String username, String password, int otp) {
		System.out.println("logging in with username: " + username + ", password: " + password + " and OTP: " + otp);
	}

	// Login with username, password and security question
	void login(String username, String password, String securityAnswer) {
		System.out.println("Logging in with username: " + username + ", password: " + password + " and security answer: "
				+ securityAnswer);
	}

}

//main class
public class MethodOverloading_QAExample {

	public static void main(String[] args) {
		LoginUtility login = new LoginUtility();

		// different ways to login (Overloaded methods)
		login.login("sumit.p", "pass@123"); // basic login
		login.login("sumit.p", "pass@123", 1234); // login with otp
		login.login("sumit.p", "pass@123", "first car name"); // login with security answer

	}

}
