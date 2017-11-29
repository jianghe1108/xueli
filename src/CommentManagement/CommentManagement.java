package CommentManagement;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class CommentManagement extends BaseTest{
	public WebDriverEngine webtest;
	public CommentManagement(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	public void search(String id){
		//������۹���
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/a/span");
		//��������б�
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/ul/li/a");
		//��λ������
		webtest.click("xpath=.//*[@id='nav-search-input']");
		webtest.type("name=id", id);
		//�������
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
	}
}
