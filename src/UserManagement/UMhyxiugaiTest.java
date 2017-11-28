package UserManagement;

import static org.testng.Assert.assertTrue;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UMhyxiugaiTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception{
		TestRunner runner = (TestRunner) context;
		runner.addListener(new Listener());
	}
	@Test
	public void testBackLogin() throws InterruptedException {
		BackLogin add=new BackLogin(webtest);
		Thread.sleep(2000);
		add.inputValues("admin", "admin");
		Thread.sleep(2000);
		assertTrue(webtest.getHtmlSource().contains("ª∂”≠π‚¡Ÿ,"));
	}
	@Test(dependsOnMethods="testBackLogin")
	public void xg() throws InterruptedException{
		UserManagementhuiyuan xg=new UserManagementhuiyuan(webtest);
        xg.searchxiugai("zhaicunqi");
		Thread.sleep(2000);
	}
}
