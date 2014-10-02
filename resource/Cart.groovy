import geb.Page;

import java.awt.print.Pageable;

import org.apache.xalan.xsltc.compiler.Import;

import geb.*

class Cart extends Page{
	static String PromoCodeButtonXpath;
	static String PromoCodeInputXpath;
	static String ProceedToCheckoutXpath;
	static String RemoveProductXpath;
	static String QTextinputxpath;
	static String QuantityDropdownExpandXpath;
	static String QuantityDropdownSelectXpath;
	
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	static content = {
		quantityTextInput{$(QTextinputxpath)}
		quantityDropDownexpand{$(QuantityDropdownExpandXpath)}
		quantityDropDownSelect{$(QuantityDropdownSelectXpath)}
		RemoveProduct{$(RemoveProductXpath)}
		ProceedToCheckout{$(ProceedToCheckoutXpath)}
		PromoCodeButton{$(PromoCodeButtonXpath)}
		PromoCodeInput{$(PromoCodeInputXpath)}
		}
	/**
	 * Not sure how to check the value of an element
	 * Can't implement yet
	 */
	public void CheckPrice(){
		
	}
	/**
	 * Not sure how to check the value of an element
	 * Can't implement yet
	 */
	public void CheckProductIsPresent(){
		
	}
	/** Update quantity method
	 * Change quantity could be a dropdown, could be a text input
	 * thus two methods
	 * @param QTextinputxpath
	 * @param quantity
	 */
	//1
	public void UpdateQuantityTextInput(String qTextinputxpath, int quantity){
		QTextinputxpath=qTextinputxpath
		quantityTextInput.value(quantity)
		}
	//2
	public void UpdateQuantityDropDown(String dropdownxpath, String selectxpath){
		QuantityDropdownExpandXpath=dropdownxpath
		QuantityDropdownSelectXpath=selectxpath
		quantityDropDownexpand.click()
		quantityDropDownSelect.click()
		
	}
	/**This method will click the 'Remove product' link in the cart
	 * 
	 * @param removeProductXpath
	 */
	public void RemoveProduct(String removeProductXpath){
		RemoveProductXpath=removeProductXpath
		RemoveProduct.click()
	}
	/**This method will click the 'proceed to checkout' button
	 * 
	 * @param ProceedToCheckoutXpath
	 */
	public void ProcedeToCheckout(String proceedToCheckoutXpath){
		ProceedToCheckoutXpath=proceedToCheckoutXpath
		ProceedToCheckout.click()
	}
	/**This method will find the input for the promo code, add a value to that input, and click the 'Submit' butten 
	 * 
	 * @param promoCode
	 * @param promocodeInputXpath
	 * @param promoCodeButtonXpath
	 */
	public void PromoCode(String promoCode, String promocodeInputXpath, String promoCodeButtonXpath){
		PromoCodeInputXpath=promocodeInputXpath
		PromoCodeButtonXpath=promoCodeButtonXpath
		PromoCodeInput.value(promoCode)
		PromoCodeButton.click()
		
	}
	/**
	 * Not sure how to check the value of an element
	 * Can't implement yet
	 */
	public void CheckQuantity(){
		
	}
	

}
