package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import Other.BackLogin;


public class UMygrepasswordTest extends BaseTest {
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void re1() throws InterruptedException{
		UserManagementyuangong re=new UserManagementyuangong(webtest);
		//1.����ǰ������һֵ
		re.searchrepawd("shop","123456", "123456");
		Thread.sleep(2000);	
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void re2() throws InterruptedException{
		UserManagementyuangong re=new UserManagementyuangong(webtest);
		//2.����ǰ�����벻һֵ
		re.searchrepawd("shop","1234567", "123456");
		Thread.sleep(2000);	
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void re3() throws InterruptedException{
		UserManagementyuangong re=new UserManagementyuangong(webtest);
		//3.������������6λ
		re.searchrepawd("shop","12345", "12345");
		Thread.sleep(2000);	
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void re4() throws InterruptedException{
		UserManagementyuangong re=new UserManagementyuangong(webtest);
		//4.��������Ϊ��
		re.searchrepawd("shop","","");
		Thread.sleep(2000);	
	 }
}