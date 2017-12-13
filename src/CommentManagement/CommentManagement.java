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
		//��������������
	    //webtest.getElementsSize("name=id");
	    webtest.type("name=id", id);
	   // webtest.type("id=nav-search-input", id);
		//�������
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
	}
	public void huifu(String id,String message){
		//������۹���
				webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/a/span");
				//��������б�
				webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/ul/li/a");
				//��λ������
				webtest.click("xpath=.//*[@id='nav-search-input']");
				//��������������
				webtest.type("name=id", id);
				//�������
				webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
				//����ظ�
				webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[12]/div/a[1]/i");
				//��λ�ظ���
				webtest.click("xpath=.//*[@id='form-input-readonly']");
				//��������
				webtest.type("name=message",message);
				//����ύ��ť
				webtest.click("xpath=.//button[@type='submit']");
	}
}
