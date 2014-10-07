import geb.Page;

class CheckoutPaymentDetail extends Page{
	static String SubmitXpath;
	static String UDAXpath; //Use Delivery Address
	static String YearInputXpath;
	static String MonthInputXpath;
	static String CardVerificationInputXpath;
	static String CardInputXpath;
	static String NameInputXpath;
	static String SelectCardXpath;
	static String DropdownExpandXpath;
	static String DropdownSelectXpath;
	
	
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	static content = {
		Submit{$(SubmitXpath)}
		UDA{$(UDAXpath)}
		YearInput{$(YearInputXpath)}
		MonthInput{$(MonthInputXpath)}
		CardVerificationInput{$(CardVerificationInputXpath)}
		CardInput{$(CardInputXpath)}
		NameInput{$(NameInputXpath)}
		SelectCard{$(SelectCardXpath)}
		DropdownExpand{$(DropdownExpandXpath)}
		DropdownSelect{$(DropdownSelectXpath)}
		
	}
	
	/**This method clicks on a specified card type
	 * @param selectCardXpath
	 */
	public void SelectCardType(String selectCardXpath){
		SelectCardXpath=selectCardXpath
		SelectCard.click()
		
	}
	/**This method selects a credit card from a credit card drop down
	 * @param dropdownExpandXpath
	 * @param dropdownSelectXpath
	 */
	public void SelectCardTypeDropDown(String dropdownExpandXpath, String dropdownSelectXpath){
		DropdownExpandXpath=dropdownExpandXpath
		DropdownSelectXpath=dropdownSelectXpath
		DropdownExpand.click()
		DropdownSelect.click()
		
	}
	/**This inputs a name in to a text input
	 * @param nameInputXpath
	 * @param name
	 */
	public void NameOnCardInput(String nameInputXpath, String name){
		NameInputXpath=nameInputXpath
		NameInput.value(name)
	}
	
	/**This inputs a card number in to a text input 
	 * @param cardInputXpath
	 * @param cardNumber
	 */
	public void CardNumberInput(String cardInputXpath, String cardNumber){
		CardInputXpath=cardInputXpath
		CardInput.value(cardNumber)
		
	}
	/**This inputs a card verification number in to a text input 
	 * @param cardVerificationInputXpath
	 * @param cardVerificationNumber
	 */
	public void CardVerification(String cardVerificationInputXpath, String cardVerificationNumber){
		CardVerificationInputXpath=cardVerificationInputXpath
		CardVerificationInput.value(cardVerificationNumber)
	}
	/**This inputs a card expiration date in to a text input
	 * @param monthInputXpath
	 * @param yearInputXpath
	 * @param month
	 * @param year
	 */
	public void ExpirationDateInput(String monthInputXpath, String yearInputXpath, String month, String year){
		MonthInputXpath=monthInputXpath
		YearInputXpath=yearInputXpath	
		MonthInput.value(month)
		YearInput.value(year)
	}
	/**This method selects the delivery address as the billing address
	 * @param uDAXpath
	 */
	public void UseDeliveryAddress(String uDAXpath){
		UDAXpath=uDAXpath
		UDA.click()
	}
	/**This method s
	 * @param submitXpath
	 */
	public void SubmitPaymentInfo(String submitXpath){
		SubmitXpath=submitXpath
		Submit.click()
	}

}
