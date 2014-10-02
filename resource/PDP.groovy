import java.awt.print.Pageable;

import org.apache.xalan.xsltc.compiler.Import;
import geb.*
import geb.Page;



public class PDP extends Page{
	static String AddToCartButtonXpath;
	static String QuantityTextInputXpath;
	static String QuantityDropdownExpandXpath;
	static String QuantityDropdownSelectXpath;
	static String PriceXpath
	static String CrossSellXpath
	
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	static content = {
		addToCartButton{$(AddToCartButtonXpath)}
		quantityTextInput{$(QuantityTextInputXpath)}
		quantityDropDownexpand{$(QuantityDropdownExpandXpath)}
		quantityDropDownSelect{$(QuantityDropdownSelectXpath)}
		priceElement{$(PriceXpath)}
		CrossSellElement{$(CrossSellXpath)}
	}
	
	/**Add to cart method
	 * note the  waitFor method, might be nice to implement elsewhere
	 * @param cartButtonXpath
	 */
	public void AddToCart(String cartButtonXpath){
		AddToCartButtonXpath=cartButtonXpath
		waitFor {
			addToCartButton.displayed
		}
		addToCartButton.click()
		} 
	
	
	/** Change quantity method
	 * Change quantity could be a dropdown, could be a text input
	 * thus two methods
	 * @param QTextinputxpath
	 * @param quantity
	 */
	//1
	public void ChangeQuantityTextInput(String QTextinputxpath, int quantity){
		QuantityTextInputXpath=QTextinputxpath
		quantityTextInput.value(quantity)
		}
	//2
	public void ChangeQuantityDropDown(String dropdownxpath, String selectxpath){
		QuantityDropdownExpandXpath=dropdownxpath
		QuantityDropdownSelectXpath=selectxpath
		quantityDropDownexpand.click()
		quantityDropDownSelect.click()
		
	}
	/**Check price method
	 * This method MAY NOT WORK
	 * @param actualPriceXpath
	 * @param assumedPrice
	 */
	
	public void CheckPrice(String actualPriceXpath, float assumedPrice){
		
		float actualPrice= priceElement.getValue() //not sure if works .getAttribute?
		
        assert actualPrice == assumedPrice
		}
	/**
	 * This method will add a cross sell item to the cart
	 * @param xsellxpath
	 */
    public void AddCrossSellProduct(String xsellxpath){
		
		CrossSellXpath =xsellxpath
		CrossSellElement.click()
		}

	
	}