package CommentManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import Other.BackLogin;
import Other.Listener;

public class CMhuifuTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new Listener());
	    	}
	@Test
	public void testBackLogin() throws InterruptedException{
		BackLogin add=new Other.BackLogin(webtest);
		Thread.sleep(2000);	
		add.inputValues("admin","admin");
		Thread.sleep(2000);
		assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));		
	}
	@Test(dependsOnMethods="testBackLogin")
	public void hf() throws InterruptedException{
		CommentManagement hf=new CommentManagement(webtest);
		//1.�ظ���������
		hf.huifu("5","��л���ĺ񰮣��ڴ������ٴι��");
		Thread.sleep(2000);
	}
}

