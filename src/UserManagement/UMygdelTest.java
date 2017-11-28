package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UMygdelTest extends BaseTest{
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
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void del() throws InterruptedException{
		UserManagementyuangong del=new UserManagementyuangong(webtest);
		//1.ɾ�����ڵ��û���
		del.searchdel("admin5");
		Thread.sleep(2000);
		//2.ɾ�������ڵ��û���
		del.searchdel("te");
		Thread.sleep(2000);
	}
}
