package OrderManagement;

import static org.testng.Assert.assertTrue;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class OMxiugaiTest extends BaseTest{
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
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void xg() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
	    //1.正确格式
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","123.00");
	   	Thread.sleep(3000);
        //2.联系人为空
	 	xg.xiugai("","湖北省襄樊市樊城区","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	    //3.联系人为符号
	 	xg.xiugai("！@#￥%……&*","湖北省襄樊市樊城区","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	    //4.地址为空
	 	xg.xiugai("zhaicunqi","","111111","13705487172","123.00");
	 	Thread.sleep(3000);
	 	//5.地址符号
	 	xg.xiugai("zhaicunqi","！@#￥%……&*","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	    //6.邮编为空
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","","13705487172","123.00");
	   	Thread.sleep(3000);
	    //7.邮编少一位数字
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","12345","13705487172","123.00");
	   	Thread.sleep(3000);
	    //8.邮编多一位数字
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","1234567","13705487172","123.00");
	   	Thread.sleep(3000);
	    //9.邮编为符号
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","！@#￥%……","13705487172","123.00");
	   	Thread.sleep(3000);
	    //10.电话号码为空
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","","123.00");
	   	Thread.sleep(3000);
	    //11.电话号码少一位
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","1370548717","123.00");
	   	Thread.sleep(3000);
	    //12.电话号码多一位
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","137054871723","123.00");
	   	Thread.sleep(3000);
	    //13.电话号码为符号
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","！@#￥%……&*（）~","123.00");
	   	Thread.sleep(3000);
	    //14.价格为空
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","");
	   	Thread.sleep(3000);
	    //15.价格为负
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","-123.00");
	   	Thread.sleep(3000);
	    //16.价格为0
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","0");
	   	Thread.sleep(3000);
	    //17.价格为符号
	 	xg.xiugai("zhaicunqi","湖北省襄樊市樊城区","111111","13705487172","！@#￥%……&*");
	   	Thread.sleep(3000);
	 }  
}