package OrderManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;


public class OMsearchTest extends BaseTest{
	
	@Test
    public void testBackLogin() throws InterruptedException {
		BackLogin add=new Other.BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void sear1() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
	    //1.�������û�������
	 	sear.search("14380529374","����");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("����"));  
	}  
	@Test(dependsOnMethods="testBackLogin")
	public void sear2() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//2.�������û��������ڣ������Ŵ���
		sear.search("14380529374","����");
		Thread.sleep(3000);
	} 
	@Test(dependsOnMethods="testBackLogin")
	public void sear3() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//3.�������û��������ڣ������Ų�����
		sear.search("14380529375","����");
		Thread.sleep(3000);
	} 
	@Test(dependsOnMethods="testBackLogin")
	public void sear4() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//4.ֻ���û���
		sear.search("","����");
		Thread.sleep(3000);
	} 
	@Test(dependsOnMethods="testBackLogin")
	public void sear5() throws InterruptedException { 
		OrderManagement sear=new OrderManagement(webtest);
		//5.ֻ�Ѷ�����
		sear.search("14380529374","");
		Thread.sleep(3000);
	} 
}