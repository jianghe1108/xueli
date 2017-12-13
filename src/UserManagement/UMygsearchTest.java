package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;

public class UMygsearchTest extends BaseTest{
	
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	//1.
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void sear1() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //1.�������û�������
	 	sear.search("shop");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void sear2() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //2.�������û���������
	 	sear.search("shop1");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void sear3() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	    //3.����������Ϊ��ʵ����
	 	sear.search("����");
	 }  
	@Test(dependsOnMethods="testBackLogin")
	public void sear4() throws InterruptedException { 
	    UserManagementyuangong sear=new UserManagementyuangong(webtest);
	 	//4.����������Ϊ�û�ID
	 	sear.search("3"); 
	 }  
}