package CommentManagement;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class CMsearchTest extends BaseTest{
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
		CommentManagement sear=new CommentManagement(webtest);
	    //1.�������ڵ�ID
	 	sear.search("6");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("6"));
	    //2.���������ڵ�ID
	 	sear.search("7");
	   	Thread.sleep(3000);
	    //3.������ƷID
	 	sear.search("25");
	   	Thread.sleep(3000);
	    //4.�����û�ID
	 	sear.search("7");
	   	Thread.sleep(3000);
	    //6.����״̬
	 	sear.search("��ʾ");
	   	Thread.sleep(3000);
	    //7.��������
	 	sear.search("5");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("�򶯰�����"));
	    //8.��������
	 	sear.search("�򶯰�����");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("�򶯰�����"));
	 }  
}