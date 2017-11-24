package Jingdongback;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class UserManagementhuiyuan extends BaseTest{
	public WebDriverEngine webtest;
	public UserManagementhuiyuan(WebDriverEngine webtest) {
		this.webtest = webtest;
    }
	public void inputValues(String username,String nickname,String password,String password2,String email,String phone,
     String year,String month,String day,String sex) throws InterruptedException {
		Thread.sleep(3000);
		//点击用户管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //点击会员列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[2]/a");
		//点击添加会员
		webtest.click("xpath=.//*[@id='breadcrumbs']/a");
		webtest.type("name=username",username);
		webtest.type("name=nickname",nickname);
		webtest.type("name=password",password);
		webtest.type("name=password2",password2);
		webtest.type("name=email",email);
		webtest.type("name=phone",phone);
		webtest.type("name=year",year);
		webtest.type("name=month",month);
		webtest.type("name=day",day);
		webtest.click("xpath=//input[@value='"+sex+"']");
		webtest.click("xpath=//input[@name='state'and @value='1']");
		Thread.sleep(3000);
	    webtest.click("xpath=.//button[@type='submit']");
	} 
}

