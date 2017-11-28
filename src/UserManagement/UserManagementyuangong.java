package UserManagement;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class UserManagementyuangong extends BaseTest{
	public WebDriverEngine webtest;
	public UserManagementyuangong(WebDriverEngine webtest) {
		this.webtest = webtest;
    }
	public void addyuangong(String name,String password,String password2,String realname,String phone,String province,
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
		webtest.click("xpath=//input[@value='"+sex+"']");
		webtest.click("xpath=//input[@value='"+state+"']");
		webtest.click("xpath=//input[@value='"+admingroup+"']");
		Thread.sleep(3000);
	    webtest.click("xpath=.//button[@type='"+button+"']");
	} 
	public void search(String name1){
		//点击用户管理
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
		//点击员工列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//点击搜索栏（请输入用户名搜索）
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/input");
		//输入用户名
		webtest.type("name=name",name1);
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/button");
	}
	public void searchbianji(String name1,String address){
		//点击用户管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //点击员工列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//点击搜索栏（请输入用户名搜索）
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/input");
		//输入用户名
		webtest.type("name=name",name1);
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/button");
		//点击编辑按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[1]/i");
		webtest.type("name=address", address);
		//点击确定按钮
		webtest.click("xpath=.//button[@type='submit']");
	}
	public void searchchakanzu(String name2){
		//点击用户管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //点击员工列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//点击搜索栏（请输入用户名搜索）
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/input");
		//输入用户名
		webtest.type("name=name",name2);
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/button");
		//点击查看组
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[2]/i");
	    webtest.click("xpath=.//input[@value='13']");
	    webtest.click("xpath=.//button[@type='submit']");
	}
	public void searchrepawd(String name1,String password,String password2){
		//点击用户管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //点击员工列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//点击搜索栏（请输入用户名搜索）
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/input");
		//输入用户名
		webtest.type("name=name",name1);
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/button");
		//修改用户密码
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[2]/td/ul/li[7]/a");
		//点击修改密码
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[3]/i");
		webtest.type("name=password", password);
		webtest.type("name=password2", password2);
		webtest.click("xpath=.//button[@type='submit']");
	}
	public void searchdel(String name1){
		//点击用户管理
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //点击员工列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//点击搜索栏（请输入用户名搜索）
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/input");
		//输入用户名
		webtest.type("name=name",name1);
		//点击搜索按钮
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/button");
		//点击删除
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[4]/i");
		//确定删除
		webtest.getAlert().accept();
		//确定取消
		//webtest.getAlert().dismiss();
	}
	
}

