package UserManagement;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import Other.BackLogin;

public class UMygbianjiTest extends BaseTest{
	@Test
	public void testBackLogin() throws InterruptedException {
		BackLogin add=new BackLogin(webtest);
		Thread.sleep(2000);
		add.inputValues("admin", "admin");
		Thread.sleep(2000);
		assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
	}
	@Test(dependsOnMethods="testBackLogin")
	public void bj() throws InterruptedException{
		UserManagementyuangong bj=new UserManagementyuangong(webtest);
        bj.searchbianji("shop","北京市");
		Thread.sleep(2000);
	}
}
