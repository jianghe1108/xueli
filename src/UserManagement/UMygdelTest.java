package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;

public class UMygdelTest extends BaseTest{

	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void del1() throws InterruptedException{
		UserManagementyuangong del=new UserManagementyuangong(webtest);
		//1.删除存在的用户名
		del.searchdel("admin5");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="testBackLogin")
	public void del2() throws InterruptedException{
		UserManagementyuangong del=new UserManagementyuangong(webtest);
		//2.删除不存在的用户名
		del.searchdel("te");
		Thread.sleep(2000);
	}
}
