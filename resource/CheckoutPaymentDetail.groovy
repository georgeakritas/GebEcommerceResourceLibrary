package resource

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
	public void SelectCardType(String selectCardXpath){
		SelectCardXpath=selectCardXpath
		SelectCard.click()
		
	}
	public void SelectCardTypeDropDown(String dropdownExpandXpath, String dropdownSelectXpath){
		DropdownExpandXpath=dropdownExpandXpath
		DropdownSelectXpath=dropdownSelectXpath
		DropdownExpand.click()
		DropdownSelect.click()
		
	}
	public void NameOnCardInput(String nameInputXpath, String name){
		NameInputXpath=nameInputXpath
		NameInput.value(name)
	}
	public void CardNumberInput(String cardInputXpath, String cardNumber){
		CardInputXpath=cardInputXpath
		CardInput.value(cardNumber)
		
	}
	public void CardVerificationInput(String cardVerificationInputXpath, String cardVerificationNumber){
		CardVerificationInputXpath=cardVerificationInputXpath
		CardVerificationInput.value(cardVerificationNumber)
	}
	public void ExpirationDateInput(String monthInputXpath, String yearInputXpath, String month, String year){
		MonthInputXpath=monthInputXpath
		YearInputXpath=yearInputXpath	
		MonthInput.value(month)
		YearInput.value(year)
	}
	public void UseDeliveryAddress(String uDAXpath){
		UDAXpath=uDAXpath
		UDA.click()
	}
	public void SubmitPaymentInfo(String submitXpath){
		SubmitXpath=submitXpath
		Submit.click()
	}

}
