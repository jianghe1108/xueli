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
		webtest.type("name=id", id);
		//点击搜索
		webtest.click("xpath=.//*[@id='nav-search']/form/span/button");
	}
}
