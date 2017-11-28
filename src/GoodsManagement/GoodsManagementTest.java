package GoodsManagement;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class GoodsManagementTest extends BaseTest{
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
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void goodsM() throws InterruptedException { 
	    GoodsManagement goodsM=new GoodsManagement(webtest);
	    goodsM.inputValues("毛衣", "----针织衫",null, "49.9", "30.9", "黑色", "S", "49.9", "49", "C:\\Users\\acer\\Pictures\\lovewallpaper\\1.jpg","商品描述","进仓库","推销","热销","submit");
	 }
}	   