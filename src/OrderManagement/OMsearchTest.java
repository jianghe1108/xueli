package OrderManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class OMsearchTest extends BaseTest{
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
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void sear() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
	    //1.�������û�������
	 	sear.search("14380529374","����");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("����"));
	    //2.�������û��������ڣ������Ŵ���
	 	sear.search("14380529374","����");
	   	Thread.sleep(3000);
	    //3.�������û��������ڣ������Ų�����
	 	sear.search("14380529375","����");
	   	Thread.sleep(3000);
	    //4.ֻ���û���
	 	sear.search("","����");
	   	Thread.sleep(3000);
	    //6.ֻ�Ѷ�����
	 	sear.search("14380529374","");
	   	Thread.sleep(3000);
	 }  
}