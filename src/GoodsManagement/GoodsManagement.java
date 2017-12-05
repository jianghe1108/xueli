package GoodsManagement;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class GoodsManagement extends BaseTest{
	public WebDriverEngine webtest;
	public GoodsManagement(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	public void addgoods(String name,String type_id,String brand_id,String saleprice,String costprice,String price1,String price2,String num1,String num2,String pic,String p) throws InterruptedException {
		Thread.sleep(3000);
		//点击商品管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[2]/a/span");
	    //点击列表的商品管理
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[2]/ul/li[1]/a");
		//点击添加商品
		webtest.click("xpath=.//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a");
		webtest.type("name=name",name);
		webtest.selectByValue("name=type_id",type_id);
		webtest.type("name=brand_id",brand_id);
		webtest.type("name=saleprice",saleprice);
		webtest.type("name=costprice",costprice);
		webtest.click("xpath=//input[@value='26']");
		webtest.click("xpath=//input[@value='28']");
		webtest.click("xpath=//input[@value='30']");
		webtest.type("xpath=//*[@id='process']/tbody/tr[1]/td[3]/input", price1);
		webtest.type("xpath=.//*[@id='process']/tbody/tr[1]/td[4]/input",num1);
		webtest.type("xpath=.//*[@id='process']/tbody/tr[2]/td[3]/input", price2);
		webtest.type("xpath=.//*[@id='process']/tbody/tr[2]/td[4]/input", num2);
		webtest.type("name=pic",pic);
	//	Thread.sleep(5000);
	//	webtest.enterFrame("ueditor_0");
	//	webtest.type("xpath=//body/p", p);
	//	webtest.leaveFrame();
		webtest.Tab();
		webtest.Tab();
		webtest.Tab();
		webtest.Tab();
		webtest.Sendkeys(p);
		Thread.sleep(5000);
		webtest.click("xpath=//input[@name='state' and @value='2']");
		webtest.click("xpath=//input[@name='ishot']");
		Thread.sleep(3000);
	    webtest.click("xpath=.//button[@type='submit']");
	} 
}