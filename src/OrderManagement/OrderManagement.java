package OrderManagement;
5

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class OrderManagement extends BaseTest{
	public WebDriverEngine webtest;
	public OrderManagement(WebDriverEngine webtest) {
		this.webtest = webtest;
    }
	public void search(String osn) throws InterruptedException {
		Thread.sleep(3000);
		//点击订单管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/a/span");
	    //点击订单列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/ul/li/a");
		//点击订单号的搜索框
		webtest.click("xpath=.//*[@id='nav-search-input']");
		webtest.type("name=osn", osn);
		//点击联系人的搜索框
		webtest.click("xpath=.//*[@id='nav-search-input']");
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");

		
		
		
	
	
	} 
}

