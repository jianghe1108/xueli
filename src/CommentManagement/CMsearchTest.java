package CommentManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import Other.BackLogin;


public class CMsearchTest extends BaseTest{
	public CMsearchTest(){
	System.out.println("����Ĺ��췽��");
	}
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
		CommentManagement sear=new CommentManagement(webtest);
	    //1.�������ڵ�ID
	 	sear.search("6");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("6"));
	}  
	 @Test(dependsOnMethods="testBackLogin")
	 public void sear2() throws InterruptedException {
	    CommentManagement sear=new CommentManagement(webtest);
		//2.���������ڵ�ID
		sear.search("7");
		Thread.sleep(3000);	   
	}
	 @Test(dependsOnMethods="testBackLogin")
	 public void sear3() throws InterruptedException {
		CommentManagement sear=new CommentManagement(webtest);
		//3.������ƷID
	    sear.search("25");
	    Thread.sleep(3000);  
    }
	 @Test(dependsOnMethods="testBackLogin")
	 public void sear4() throws InterruptedException {
		CommentManagement sear=new CommentManagement(webtest);
		//4.�����û�ID
		sear.search("7");
		Thread.sleep(3000); 
	}
	 @Test(dependsOnMethods="testBackLogin")
	 public void sear5() throws InterruptedException{
		CommentManagement sear=new CommentManagement(webtest);
		//5.����״̬
		sear.search("��ʾ");
		Thread.sleep(3000);
	}
	 @Test(dependsOnMethods="testBackLogin")
	 public void sear6() throws InterruptedException{
		CommentManagement sear=new CommentManagement(webtest);
		//6.��������
		sear.search("5");
		Thread.sleep(9000);
		assertTrue(webtest.getHtmlSource().contains("�򶯰�����"));

	}
	 @Test(dependsOnMethods="testBackLogin")
	 public void sear7() throws InterruptedException{
		CommentManagement sear=new CommentManagement(webtest);
		//7.��������
		sear.search("�򶯰�����");
		Thread.sleep(3000);
		assertTrue(webtest.getHtmlSource().contains("�򶯰�����"));
	}
}