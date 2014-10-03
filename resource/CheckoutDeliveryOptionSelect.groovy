import geb.Page;


class CheckoutDeliveryOptionSelect extends Page{

	static String SelectDeliveryXpath;
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
		SelectDelivery{$(SelectDeliveryXpath)}
		DropdownExpand{$(DropdownExpandXpath)}
		DropdownSelect{$(DropdownSelectXpath)}
	}
	
	public void SelectDeliveryOption(String selectDeliveryXpath){
		SelectDeliveryXpath=selectDeliveryXpath
		SelectDelivery.click()
	}
	public void SelectDeliveryOptionDropdown(String dropdownExpandXpath, String dropdownSelectXpath ){
		DropdownExpandXpath=dropdownExpandXpath
		DropdownSelectXpath=dropdownSelectXpath
		DropdownExpand.click()
		DropdownSelect.click()
		
	}
}
