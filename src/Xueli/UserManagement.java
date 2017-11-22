package Xueli;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class UserManagement extends BaseTest{
	public WebDriverEngine webtest;
    public String name;
    public String password;
    public String password2;
    public String realname;
    public String phone;
    public String province;
    public String city;
    public String county;
    public String address;
    public String email;
    public String sex;
    public String state;
    public String admingroup;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAdmingroup() {
		return admingroup;
	}
	public void setAdmingroup(String admingroup) {
		this.admingroup = admingroup;
	}
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public UserManagement(WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }
	public void inputValues(String name,String password,String password2,String realname,String phone,String province,
     String city,String county,String address,String email,String sex,String state,String admingroup,String button) throws InterruptedException {
		Thread.sleep(3000);
		//点击用户管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //点击员工列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//点击添加员工
		webtest.click("xpath=.//*[@id='breadcrumbs']/a");
		webtest.type("name=name",name);
		webtest.type("name=password",password);
		webtest.type("name=password2",password2);
		webtest.type("name=realname",realname);
		webtest.type("name=phone",phone);
		webtest.type("name=province",province);
		webtest.type("name=city",city);
		webtest.type("name=county",county);
		webtest.type("name=address",address);
		webtest.type("name=email",email);
	//  webtest.type("name=sex", sex);
		webtest.click("xpath=//input[@value='"+sex+"']");
	//  webtest.type("name=state", state);
		webtest.click("xpath=//input[@value='"+state+"']");
	//	webtest.type("name=admingroup", admingroup);
		webtest.click("xpath=//input[@value='"+admingroup+"']");
		Thread.sleep(3000);
	    webtest.click("xpath=.//button[@type='"+button+"']");
	} 
}

