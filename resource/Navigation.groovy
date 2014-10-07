import java.awt.print.Pageable;

import org.apache.xalan.xsltc.compiler.Import;
import geb.*
import geb.Page;

class Navigation extends Page{
	static String BreadCrumbXpath;
	static String HomeLinkXpath;
	static String MainCategoryLinkXapth;
	static String PromotionalLinkXpath;
	static String SearchInputXpath;
	static String SearchButtonXpath;
	
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	static content = {
		BreadCrumb{$(BreadCrumbXpath)}
		HomeLink{$(HomeLinkXpath)}
		MainCategoryLink{$(MainCategoryLinkXapth)}
		PromotionalLink{$(PromotionalLinkXpath)}
		SearchInput{$(SearchInputXpath)}
		SearchButton{$(SearchButtonXpath)}
	}
	/**
	 * This method will search for a given product
	 * @param queryString
	 * @param searchInputXpath
	 * @param searchButtonXpath
	 */
	
	public void SearchForProduct(String queryString, String searchInputXpath, String searchButtonXpath){
		SearchInputXpath=searchInputXpath
		SearchButtonXpath=searchButtonXpath
		SearchInput.value(queryString)
		SearchButton.click()
		
	}
	/**
	 * This method will click a promotional link or banner advertisement.
	 * @param promotionalLinkXpath
	 */
	public void  ClickPromotionalLink(String promotionalLinkXpath){
		PromotionalLinkXpath=promotionalLinkXpath
		PromotionalLink.click()
	}
	/**
	 * This method will navigate by top main category
	 * @param mainCategoryLinkXapth
	 */
	public void NavigateByMainCategory(String mainCategoryLinkXapth){
		MainCategoryLinkXapth=mainCategoryLinkXapth
		MainCategoryLink.click()
	}
	
	/**
	 * This method will click the home page link
	 * @param homeLinkXpath
	 */
	public void ClickHomeLink(String homeLinkXpath){
		HomeLinkXpath=homeLinkXpath
		HomeLink.click()
		}
	/**
	 * This method will navigate by a breadcrumb
	 * @param breadCrumbXpath
	 */
	public void NavigateByBreadCrumbs(String breadCrumbXpath){
		BreadCrumbXpath=breadCrumbXpath
		BreadCrumb.click()
	}
	/**
	 * Not sure how to execute this method just yet
	 */
	public void CheckUserIsLoggedIn(){
		
	}
	
}
