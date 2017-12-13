package UserManagement;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;

public class UMaddyuangongTest extends BaseTest{
	
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
     	assertTrue(webtest.getHtmlSource().contains("欢迎光临,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void addY1() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	    //1.正常流程，且填入的为有效正确的信息
	    addY.addyuangong("admin1", "admin1", "admin1", "员工一", "15732176521", "河北省", "石家庄市", "裕华区", "河北省石家庄市","1639619411@qq.com","男","工作中","普通员工", "submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY2() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//2.选择信息为女、禁用、超级管理员
	    addY.addyuangong("admin2", "admin2", "admin2", "员工二", "15732176522", "河北省", "石家庄市", "裕华区", "河北省石家庄市","1639619412@qq.com","女","禁用","普通员工", "submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY3() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//3.电话信息与1重复
	    addY.addyuangong("admin3", "admin3", "admin3", "员工三", "15732176521", "河北省", "石家庄市", "裕华区", "河北省石家庄市","1639619413@qq.com","女","禁用","普通员工","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY4() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//4.邮箱信息与1重复
	    addY.addyuangong("admin4", "admin4", "admin4", "员工四", "15732176524", "河北省", "石家庄市", "裕华区", "河北省石家庄市","1639619411@qq.com","女","禁用","普通员工","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY5() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//5.地址栏与详细地址栏省份地址不一致
	    addY.addyuangong("admin5", "admin5", "admin5", "员工五", "15732176525", "河北省", "石家庄市", "裕华区", "黑龙江省海伦市","1639619415@qq.com","女","禁用","普通员工","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY6() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	    //6.详细地址栏为不存在的省份信息或省份与市级信息不匹配
	    addY.addyuangong("admin6", "admin6", "admin6", "员工六", "15732176526", "河北省", "石家庄市", "裕华区", "黑龙江省三河市","1639619416@qq.com","女","禁用","普通员工","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY7() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	    //7.邮箱格式不正确
	    addY.addyuangong("admin7", "admin7", "admin7", "员工七", "15732176527", "河北省", "石家庄市", "裕华区", "河北省石家庄市","1639619417@.com","女","禁用","普通员工","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY8() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//8.点击重置按钮
	    addY.addyuangong("admin0", "admin0", "admin0", "员工", "15732176520", "河北省", "石家庄市", "裕华区", "河北省石家庄市","1639619410@qq.com","男","工作中","普通员工","reset");
	   	Thread.sleep(3000);
	 }
}
