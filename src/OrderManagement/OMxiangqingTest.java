package OrderManagement;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;


public class OMxiangqingTest extends BaseTest{

	@Test
    public void testBackLogin() throws InterruptedException {
		BackLogin add=new Other.BackLogin(webtest);
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