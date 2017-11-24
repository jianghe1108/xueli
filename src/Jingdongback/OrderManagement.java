package Jingdongback;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class OrderManagement extends BaseTest{
	public WebDriverEngine webtest;
	public OrderManagement(WebDriverEngine webtest) {
		this.webtest = webtest;
    }
	public void inputValues(String name,String password,String password2,String realname,String phone,String province,
     String city,String county,String address,String email,String sex,String state,String admingroup,String button) throws InterruptedException {
		Thread.sleep(3000);
		//点击订单管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/a/span");
	    //点击订单列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/ul/li/a");
		
	} 
}

