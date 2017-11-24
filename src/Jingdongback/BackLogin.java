package Jingdongback;

import com.webtest.core.WebDriverEngine;

public class BackLogin {
	
    public WebDriverEngine webtest;
	public BackLogin(WebDriverEngine webtest) {
		this.webtest = webtest;	
    }
	public void inputValues(String name,String password) {
		webtest.open("http://localhost:8032/zl_shop/admin.php/Login/");
		webtest.type("name=name", name);
		webtest.type("name=password", password);
		webtest.click("xpath=//button[@type='submit']");
	//	webtest.click("xpath=.//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button");
	}
	
}