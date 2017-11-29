package OrderManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class OMxiangqingTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new UserManagement.Listener());
	    	}
	@Test
    public void testBackLogin() throws InterruptedException {
		UserManagement.BackLogin add=new UserManagement.BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("ª∂”≠π‚¡Ÿ,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void xq() throws InterruptedException { 
		OrderManagement xq=new OrderManagement(webtest);
	 	xq.xiangqing();
	   	Thread.sleep(3000);
	 }  
}