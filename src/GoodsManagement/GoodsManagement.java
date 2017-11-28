package GoodsManagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class GoodsManagement extends BaseTest{
	public WebDriverEngine webtest;
	public GoodsManagement(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	public void inputValues(String name,String type_id,String brand_id,String saleprice,String costprice,String colors,
     String sizes,String price,String num,String pic,String p,String state,String isbest,String ishot,String button) throws InterruptedException {
		Thread.sleep(3000);
		//点击商品管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[2]/a/span");
	    //点击列表的商品管理
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[2]/ul/li[1]/a");
		//点击添加商品
		webtest.click("xpath=.//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a");
		webtest.type("name=name",name);
		Thread.sleep(3000);
	//	webtest.type("name=type_id",type_id);
		webtest.selectByValue("name=type_id",type_id);
		Thread.sleep(3000);
		webtest.type("name=brand_id",brand_id);
		Thread.sleep(3000);
		webtest.type("name=saleprice",saleprice);
		Thread.sleep(3000);
		webtest.type("name=costprice",costprice);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='"+colors+"']");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='"+sizes+"']");
		Thread.sleep(3000);
		webtest.type("name=price",price);
		Thread.sleep(3000);
		webtest.type("name=num",num);
		Thread.sleep(3000);
		webtest.type("name=pic",pic);
		WebDriver wd = null;
		Actions action=new Actions(wd);
			action.sendKeys(Keys.TAB);
			action.sendKeys(Keys.TAB);
			action.sendKeys(Keys.TAB);
			action.sendKeys(Keys.END);
			webtest.type("name=p",p);	
		webtest.click("xpath=//input[@value='"+state+"']");
		webtest.click("xpath=//input[@value='"+isbest+"']");
		webtest.click("xpath=//input[@value='"+ishot+"']");
	    webtest.click("xpath=.//button[@type='"+button+"']");
	} 
}