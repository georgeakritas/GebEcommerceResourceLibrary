import java.awt.print.Pageable;

import org.apache.xalan.xsltc.compiler.Import;
import geb.*
import geb.Page;

class PLP extends Page{
	static String ShowAllLinkXpath
	static String RefineCheckboxXpath
	static String RefineLinkXpath
	static String ProductLinkXpath
	
	
	public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	static content = {
	    ShowAllLink{$(ShowAllLinkXpath)}
		RefineCheckbox{$(RefineCheckboxXpath)}
		refineLink{$(RefineLinkXpath)}
		productLink{$(ProductLinkXpath)}
		}
	/**
	*This method checks if a product link is present 
	* @param productLinkXpath
	*/
	public void CheckProductInPLP(String productLinkXpath){
		ProductLinkXpath = productLinkXpath
		waitFor {
			productLink.displayed
		}
		
	}
	/**
	 * This method refines search results by a certain parameter
	 * @param refineLinkXpath
	 */
	public void RefineLink(String refineLinkXpath){
		RefineLinkXpath = refineLinkXpath
		refineLink.click()
		
	}
	/**
	 * This method refines search results by a certain parameter
	 * @param refineCheckboxXpath
	 */
	public void RefineCheckbox(String refineCheckboxXpath){
		RefineCheckboxXpath=showAllLinkXpath
		RefineCheckbox.click()
	}
	/**This method clisks the 'Show all' link
	 * 
	 * @param showAllLinkXpath
	 */
	public void ShowAll(String showAllLinkXpath){
		ShowAllLinkXpath=showAllLinkXpath
		ShowAllLink.click()
	}
	
		
}
