package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;

public class UMygsearchTest extends BaseTest{
	
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	//1.
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void sear1() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //1.搜索的用户名存在
	 	sear.search("shop");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void sear2() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //2.搜索的用户名不存在
	 	sear.search("shop1");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void sear3() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //3.搜索的内容为真实姓名
	 	sear.search("李四");
	 }  
	@Test(dependsOnMethods="testBackLogin")
	public void sear4() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	 	//4.搜索的内容为用户ID
	 	sear.search("3"); 
	 }  
}