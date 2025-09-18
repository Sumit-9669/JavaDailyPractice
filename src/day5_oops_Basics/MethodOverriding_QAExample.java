package day5_oops_Basics;

/*🔹 Problem Statement

In test automation, we often want to launch different browsers (Chrome, Firefox, Edge, etc.) but keep the test case code the same.

A BaseTest class defines a generic method launchBrowser().

Child classes override this method for specific browsers.

At runtime, the correct browser is launched depending on the object created.*/

//Parent Class
class BaseTest {
	void launchBrowser() {
		System.out.println("Launching a generic browser... ");
	}
}

//Child class Chrome
class ChromeTest extends BaseTest {
	@Override
	void launchBrowser() {
		System.out.println("Launching the chrome browser... ");
	}
}

// Child class Firefox

class FirefoxTest extends BaseTest {
	@Override
	void launchBrowser() {
		System.out.println("Launching the firefox browser... ");
	}
}

//Main class
public class MethodOverriding_QAExample {

	public static void main(String[] args) {

		BaseTest chrome = new ChromeTest();
		BaseTest firefox = new FirefoxTest();

		chrome.launchBrowser();
		firefox.launchBrowser();

	}

}
