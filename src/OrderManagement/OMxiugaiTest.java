package OrderManagement;

import static org.testng.Assert.assertTrue;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class OMxiugaiTest extends BaseTest{
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
	public void xg() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
	    //1.��ȷ��ʽ
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","123.00");
	   	Thread.sleep(3000);
        //2.��ϵ��Ϊ��
	 	xg.xiugai("","����ʡ�差�з�����","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	    //3.��ϵ��Ϊ����
	 	xg.xiugai("��@#��%����&*","����ʡ�差�з�����","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	    //4.��ַΪ��
	 	xg.xiugai("zhaicunqi","","111111","13705487172","123.00");
	 	Thread.sleep(3000);
	 	//5.��ַ����
	 	xg.xiugai("zhaicunqi","��@#��%����&*","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	    //6.�ʱ�Ϊ��
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","","13705487172","123.00");
	   	Thread.sleep(3000);
	    //7.�ʱ���һλ����
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","12345","13705487172","123.00");
	   	Thread.sleep(3000);
	    //8.�ʱ��һλ����
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","1234567","13705487172","123.00");
	   	Thread.sleep(3000);
	    //9.�ʱ�Ϊ����
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","��@#��%����","13705487172","123.00");
	   	Thread.sleep(3000);
	    //10.�绰����Ϊ��
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","","123.00");
	   	Thread.sleep(3000);
	    //11.�绰������һλ
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","1370548717","123.00");
	   	Thread.sleep(3000);
	    //12.�绰�����һλ
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","137054871723","123.00");
	   	Thread.sleep(3000);
	    //13.�绰����Ϊ����
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","��@#��%����&*����~","123.00");
	   	Thread.sleep(3000);
	    //14.�۸�Ϊ��
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","");
	   	Thread.sleep(3000);
	    //15.�۸�Ϊ��
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","-123.00");
	   	Thread.sleep(3000);
	    //16.�۸�Ϊ0
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","0");
	   	Thread.sleep(3000);
	    //17.�۸�Ϊ����
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","��@#��%����&*");
	   	Thread.sleep(3000);
	 }  
}