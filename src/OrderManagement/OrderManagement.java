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
		//�����������
	    webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/a/span");
	    //��������б�
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[3]/ul/li/a");
		//��������ŵ�������
		webtest.click("xpath=.//*[@id='nav-search-input']");
		webtest.type("name=osn", osn);
		//�����ϵ�˵�������
		webtest.click("xpath=.//*[@id='nav-search-input']");
		//���������ť
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");

		
		
		
	
	
	} 
}

