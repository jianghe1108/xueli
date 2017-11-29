package OrderManagement;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class OrderManagement extends BaseTest{
	public WebDriverEngine webtest;
	public OrderManagement(WebDriverEngine webtest) {
		this.webtest = webtest; 
    }
	public void search(String osn,String linkman) throws InterruptedException {
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
		webtest.type("name=linkman",linkman);
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
	} 
	public void xiugai(String linkman,String address,String code,String phone,String money){
		//点击订单管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/a/span");
	    //点击订单列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/ul/li/a");
		//点击修改按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[1]/i");
		webtest.typeAndClear("name=linkman",linkman);
		webtest.typeAndClear("name=address", address);
		webtest.typeAndClear("name=code",code);
		webtest.typeAndClear("name=phone", phone);
		webtest.typeAndClear("name=money", money);
		webtest.click("xpath=.//button[@type='submit']");
	}
	public void xiangqing(){
		//点击订单管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/a/span");
	    //点击订单列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/ul/li/a");
		//点击详情
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[2]/i");
		//点击提醒评价
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[6]/a");
	}
}

