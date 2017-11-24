package Jingdongback;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UMaddhuiyuanTest extends BaseTest{
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
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void userH() throws InterruptedException { 
	    UserManagementhuiyuan userH=new UserManagementhuiyuan(webtest);
	    for(int i=1;i<=10;i++){
	 	userH.inputValues("admin"+i, "nicheng"+i, "password"+i, "password"+i,"163961941"+i+"@qq.com","1573217652"+i,"2017","11","8","Ů");
	   	Thread.sleep(3000);
	   	}
	 }
	   
}
