import geb.Page;


class CheckoutUserSelection extends Page{
	static String UsernameInputXpath;
	static String PwInputXpath;
	static String LoginButtonXpath;
	static String ProceedButtonXpath;
	static String EmailInputXpath;
	
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	static content = {
		UsernameInput{$()}
		PwInput{$()}
		LoginButton{$()}
		ProceedButton{$()}
		EmailInput{$()}
	}
	
	public void LogInRegisteredUser(String userName, String password, String usernameInputXpath, String pwInputXpath, String loginButtonXpath){
		UsernameInputXpath=usernameInputXpath
		PwInputXpath=pwInputXpath
		LoginButtonXpath=loginButtonXpath
		UsernameInput.value(userName)
		PwInput.value(password)
		LoginButton.click()
	}
	
	
	public void CheckOutAsGuest(String emailAddress, String emailInputXpath, String proceedButtonXpath){
		ProceedButtonXpath=proceedButtonXpath
		EmailInputXpath=emailInputXpath
		EmailInput.value(emailAddress)
		ProceedButton.click()
		
	}
	

}
