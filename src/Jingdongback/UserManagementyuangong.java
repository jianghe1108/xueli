package Jingdongback;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class UserManagementyuangong extends BaseTest{
	public WebDriverEngine webtest;
	public UserManagementyuangong(WebDriverEngine webtest) {
		this.webtest = webtest;
    }
	public void inputValues(String name,String password,String password2,String realname,String phone,String province,
     String city,String county,String address,String email,String sex,String state,String admingroup,String button) throws InterruptedException {
		Thread.sleep(3000);
		//����û�����
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //���Ա���б�
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//������Ա��
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
		//����û�����
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //���Ա���б�
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//������������������û���������
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/input");
		webtest.type("name=name",name1);
		//���������ť
		webtest.click("xpath=.//*[@id='sample-table-1']/thead/tr[1]/td/form/button");
	}
	public void other(){
		//����û�����
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/a");
	    //���Ա���б�
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[1]/ul/li[1]/a");
		//����༭��ť
		webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[1]/i");
		//��������б�
		webtest.click("xpath=.//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a");
	}
}

