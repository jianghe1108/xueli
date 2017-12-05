package UserManagement;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;

public class UMaddhuiyuanTest extends BaseTest{
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
