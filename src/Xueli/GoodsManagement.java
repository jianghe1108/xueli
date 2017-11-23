package Xueli;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class GoodsManagement extends BaseTest{
	public WebDriverEngine webtest;
    public String name;
    public String type_id;
    public String brand_id;
    public String saleprice;
    public String costprice;
    public String colors;
    public String sizes;
    public String price;
    public String num;
    public String pic;
    public String p;
    public String state;
    public String isbest;
    public String ishot;
    public String button;

	public WebDriverEngine getWebtest() {
		return webtest;
	}

	public void setWebtest(WebDriverEngine webtest) {
		this.webtest = webtest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(String saleprice) {
		this.saleprice = saleprice;
	}

	public String getCostprice() {
		return costprice;
	}

	public void setCostprice(String costprice) {
		this.costprice = costprice;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getp() {
		return p;
	}

	public void setp(String p) {
		this.p = p;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsbest() {
		return isbest;
	}

	public void setIsbest(String isbest) {
		this.isbest = isbest;
	}

	public String getIshot() {
		return ishot;
	}

	public void setIshot(String ishot) {
		this.ishot = ishot;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}
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