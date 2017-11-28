package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UMygrepasswordTest extends BaseTest {
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new Listener());
	    	}
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	 public void re() throws InterruptedException{
		UserManagementyuangong re=new UserManagementyuangong(webtest);
		//1.密码前后输入一值
		re.searchrepawd("shop","123456", "123456");
		Thread.sleep(2000);	
		//2.密码前后输入不一值
		re.searchrepawd("shop","1234567", "123456");
		Thread.sleep(2000);	
		//3.密码输入少于6位
		re.searchrepawd("shop","12345", "12345");
		Thread.sleep(2000);	
		//4.密码输入为空
		re.searchrepawd("shop","","");
		Thread.sleep(2000);	
	 }
}