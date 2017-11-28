package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UMygsearchTest extends BaseTest{
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
	public void sear() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //1.�������û�������
	 	sear.search("shop");
	   	Thread.sleep(3000);
	    //2.�������û���������
	 	sear.search("shop1");
	   	Thread.sleep(3000);
	    //3.����������Ϊ��ʵ����
	 	sear.search("����");
	 	//4.����������Ϊ�û�ID
	 	sear.search("3"); 
	 }  
}