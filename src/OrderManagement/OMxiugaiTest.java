package OrderManagement;

import static org.testng.Assert.assertTrue;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;
import Other.Listener;

public class OMxiugaiTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new Listener());
	    	}
	@Test
    public void testBackLogin() throws InterruptedException {
		BackLogin add=new Other.BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void xg1() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
	    //1.正确格式
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg2() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//2.联系人为空
		xg.xiugai("","湖北省襄樊市樊城区","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg3() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//3.联系人为符号
		xg.xiugai("！@#￥%……&*","湖北省襄樊市樊城区","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg4() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//4.地址为空
		xg.xiugai("zhaicunqi","","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg5() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//5.地址符号
		xg.xiugai("zhaicunqi","！@#￥%……&*","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg6() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//6.邮编为空
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg7() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//7.邮编少一位数字
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","12345","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg8() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//8.邮编多一位数字
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","1234567","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg9() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//9.邮编为符号
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","！@#￥%……","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg10() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//10.电话号码为空
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg11() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//11.电话号码少一位
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","1370548717","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg12() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//12.电话号码多一位
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","137054871723","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg13() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//13.电话号码为符号
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","！@#￥%……&*（）~","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg14() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//14.价格为空
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg15() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//15.价格为负
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","-123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg16() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//16.价格为0
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","0");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg17() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//17.价格为符号
		xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","！@#￥%……&*");
		Thread.sleep(3000);
	 }
}