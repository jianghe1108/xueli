package CommentManagement;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import Other.BackLogin;

public class CMhuifuTest extends BaseTest{
	
	@Test
	public void testBackLogin() throws InterruptedException{
		BackLogin add=new Other.BackLogin(webtest);
		Thread.sleep(2000);	
		add.inputValues("admin","admin");
		Thread.sleep(2000);
		assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));		
	}
	@Test(dependsOnMethods="testBackLogin")
	public void hf() throws InterruptedException{
		CommentManagement hf=new CommentManagement(webtest);
		//1.回复有限字数
		hf.huifu("5","感谢您的厚爱，期待您的再次光顾");
		Thread.sleep(2000);
	}
}

