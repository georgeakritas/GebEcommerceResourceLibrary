
import java.awt.print.Pageable;

import org.apache.xalan.xsltc.compiler.Import;
import geb.*
import geb.Page;



public class POC extends Page{
    // String testurl;
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	/*  static String getURLstring(){
		 String currentURL= 'https://www.youtube.com/watch?v=97GXQ97rvic' //browser.getCurrentUrl()
		return currentURL
		 //dest.write(closure(browser.getCurrentUrl()))
}*/
	static content = {
		logo { $("img", id: "logo" )}
	}
	public void clickYoutubeHomeLogo()
	{//someString=URL
		logo.click()
		
	}

	
}

