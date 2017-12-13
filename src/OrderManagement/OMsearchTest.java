package OrderManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;


public class OMsearchTest extends BaseTest{
	
	@Test
    public void testBackLogin() throws InterruptedException {
		BackLogin add=new Other.BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void sear1() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
	    //1.搜索的用户名存在
	 	sear.search("14380529374","陈林");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("陈林"));  
	}  
	@Test(dependsOnMethods="testBackLogin")
	public void sear2() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//2.搜索的用户名不存在，订单号存在
		sear.search("14380529374","王林");
		Thread.sleep(3000);
	} 
	@Test(dependsOnMethods="testBackLogin")
	public void sear3() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//3.搜索的用户名不存在，订单号不存在
		sear.search("14380529375","王林");
		Thread.sleep(3000);
	} 
	@Test(dependsOnMethods="testBackLogin")
	public void sear4() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//4.只搜用户名
		sear.search("","王林");
		Thread.sleep(3000);
	} 
	@Test(dependsOnMethods="testBackLogin")
	public void sear5() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//5.只搜订单号
		sear.search("14380529374","");
		Thread.sleep(3000);
	} 
}