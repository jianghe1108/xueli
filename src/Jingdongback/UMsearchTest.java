package Jingdongback;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UMsearchTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new Listener());
	    	}
	//Session session = Session.getInstance(props, new Authenticator() {
	//	public PasswordAuthentication getPasswordAuthentication() { 
		//return new PasswordAuthentication("slp6819094", "123919");
		//}
	//}
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void userH() throws InterruptedException { 
	    UserManagementyuangong userH=new UserManagementyuangong(webtest);
	    //1.�������û�������
	 	userH.search("shop");
	   	Thread.sleep(3000);
	    //2.�������û���������
	 	userH.search("shop1");
	   	Thread.sleep(3000);
	    //3.����������Ϊ��ʵ����
	 	userH.search("����");
	 	//4.����������Ϊ�û�ID
	 	userH.search("3"); 
	 }
	   
}