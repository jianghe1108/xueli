package CommentManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import Other.BackLogin;


public class CMsearchTest extends BaseTest{
	public CMsearchTest(){
	System.out.println("子类的构造方法");
	}

	@Test
    public void testBackLogin() throws InterruptedException {
		BackLogin add=new Other.BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void sear() throws InterruptedException { 
		CommentManagement sear=new CommentManagement(webtest);
	    //1.搜索存在的ID
	 	sear.search("6");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("6"));
	    //2.搜索不存在的ID
	 	sear.search("7");
	   	Thread.sleep(3000);
	    //3.搜索商品ID
	 	sear.search("25");
	   	Thread.sleep(3000);
	    //4.搜索用户ID
	 	sear.search("7");
	   	Thread.sleep(3000);
	    //6.搜索状态
	 	sear.search("显示");
	   	Thread.sleep(3000);
	    //7.搜索星星
	 	sear.search("5");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("打动阿打算"));
	    //8.搜索评论
	 	sear.search("打动阿打算");
	   	Thread.sleep(3000);
	   	assertTrue(webtest.getHtmlSource().contains("打动阿打算"));
	 }  
}