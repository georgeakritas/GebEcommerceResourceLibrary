import java.awt.print.Pageable;

import org.apache.xalan.xsltc.compiler.Import;
import geb.*
import geb.Page;



class CheckoutShippingAddress extends Page{
	
	static String SubmitXpath;
	static String PhoneXpath;
	static String ZipXpath;
	static String StateXpath;
	static String TownXpath;
	static String BuisnessXpath;
	static String AddressLineTwoXpath;
	static String AddressLineOneXpath;
	static String TitleExpandXpath;
	static String TitleSelectXpath;
	static String LastNameXpath;
	static String FirstNameXpath;
	static String CountryExpandXpath;
	static String CountrySelectXpath;
	static String UseSavedAddresXpath;
	static String CountryXpath;
	
	
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
		Phone{$(PhoneXpath)}
		Zip{$(ZipXpath)}
		State{$(StateXpath)}
		Town{$(TownXpath)}
		Buisness{$(BuisnessXpath)}
		AddressLineTwo{$(AddressLineTwoXpath)}
		AddressLineOne{$(AddressLineOneXpath)}
		TitleExpand{$(TitleExpandXpath)}
		TitleSelect{$(TitleSelectXpath)}
		LastName{$(LastNameXpath)}
		FirstName{$(FirstNameXpath)}
		CountryExpand{$(CountryExpandXpath)}
		CountrySelect{$(CountrySelectXpath)}
		UseSavedAddres{$(UseSavedAddresXpath)}
		Country{$(CountryXpath)}
		}

		
		
	/**This method selects the option to use a saved address
	 * 
	 * @param useSavedAddresXpath
	 */
	public void UseSavedAddress(String useSavedAddresXpath){
		UseSavedAddresXpath=useSavedAddresXpath
		UseSavedAddres.click()
	}
	
	/**This method inputs a country into a country text input
	 * 
	 * @param countryXpath
	 * @param country
	 */
	public void CountryInput(String countryXpath, String country){
		countryXpath=countryXpath
		Country.value(country)
	}
	
	/**This method selects a country from a drop down menu
	 * 
	 * @param countryExpandXpath
	 * @param countrySelectXpath
	 */
	public void CountryDropDown(String countryExpandXpath, String countrySelectXpath){
		CountryExpandXpath=countryExpandXpath
		CountrySelectXpath=countrySelectXpath
		CountryExpand.click()
		CountrySelect.click()
	}
	
	/**This method inputs a First name into a name text input
	 * 
	 * @param firstNameXpath
	 * @param firstName
	 */
	public void FirstNameInput(String firstNameXpath, String firstName){
		FirstNameXpath=firstNameXpath
		FirstName.value(firstName)
	}
	
	/** This method inputs a Last name into a name text input
	 * @param lastNameXpath
	 * @param lastName
	 */
	public void LastNameInput(String lastNameXpath, String lastName){
		LastNameXpath=lastNameXpath
		LastName.value(lastName)
	}
	
	/**This method Selects a title (ie Mr. Mrs.) from a dropdown menu  
	 * @param titleExpandXpath
	 * @param titleSelectXpath
	 */
	public void TitleSelectionDropdown(String titleExpandXpath, String titleSelectXpath){
		TitleExpandXpath=titleExpandXpath
		TitleSelectXpath=titleSelectXpath
		TitleExpand.click()
		TitleSelect.click()
	}
	
	/**This inputs an address in to an address text input
	 * @param addressLineOneXpath
	 * @param address
	 */
	public void AdressLine1(String addressLineOneXpath, String address){
		AddressLineOneXpath=addressLineOneXpath
		AddressLineOne.value(address)
	}
	
	/**This inputs an address in to an address text input
	 * @param addressLineTwoXpath
	 * @param address
	 */
	public void AdressLine2(String addressLineTwoXpath, String address){
		AddressLineTwoXpath=addressLineTwoXpath
		AddressLineTwo.value(address)
	}
	
	/**This inputs a business in to a text input
	 * @param buisnessXpath
	 * @param buisness
	 */
	public void Buisness(String buisnessXpath, String buisness){
		BuisnessXpath=buisnessXpath
		Buisness.value(buisness)
	}
	
	/**This inputs a Town in to a text input
	 * @param townXpath
	 * @param town
	 */
	public void TownCity(String townXpath, String town){
		TownXpath=townXpath
		Town.value(town)
	}
	
	/**This inputs a state/province in to a text input
	 * 
	 * @param stateXpath
	 * @param state
	 */
	public void StateProvince(String stateXpath, String state){
		StateXpath=stateXpath
		State.value(state)
	}
	
	/**This inputs a Zip code in to a text input
	 * 
	 * @param zipXpath
	 * @param zip
	 */
	public void ZipPostalCode(String zipXpath, String zip){
		ZipXpath=zipXpath
		Zip.value(zip)
	}
	
	/** This inputs a Phone number in to a text input
	 * @param phoneXpath
	 * @param phoneNumber
	 */
	
	public void PhoneNumber(String phoneXpath, String phoneNumber){
		PhoneXpath=phoneXpath
		Phone.value(phoneNumber)
	}
	
	/**This method clicks a submit button if there is one
	 * @param submitXpath
	 */
	public void SubmitAdressInfo(String submitXpath){
		SubmitXpath=submitXpath
		Submit.click()
	}
	
}
