package CommentManagement;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class CommentManagement extends BaseTest{
	public WebDriverEngine webtest;
	public CommentManagement(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	public void search(String id){
		//点击评论管理
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/a/span");
		//点击评论列表
		webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/ul/li/a");
		//定位搜索框
		webtest.click("xpath=.//*[@id='nav-search-input']");
		//搜索框输入内容
	    //webtest.getElementsSize("name=id");
	    webtest.type("name=id", id);
	   // webtest.type("id=nav-search-input", id);
		//点击搜索
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
	}
	public void huifu(String id,String message){
		//点击评论管理
				webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/a/span");
				//点击评论列表
				webtest.click("xpath=.//*[@id='sidebar']/ul/li[4]/ul/li/a");
				//定位搜索框
				webtest.click("xpath=.//*[@id='nav-search-input']");
				//搜索框输入内容
				webtest.type("name=id", id);
				//点击搜索
				webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
				//点击回复
				webtest.click("xpath=.//*[@id='sample-table-1']/tbody/tr[1]/td[12]/div/a[1]/i");
				//定位回复框
				webtest.click("xpath=.//*[@id='form-input-readonly']");
				//输入内容
				webtest.type("name=message",message);
				//点击提交按钮
				webtest.click("xpath=.//button[@type='submit']");
	}
}
