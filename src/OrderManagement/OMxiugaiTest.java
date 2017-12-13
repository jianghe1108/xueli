package OrderManagement;

import static org.testng.Assert.assertTrue;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

import Other.BackLogin;
import Other.Listener;

public class OMxiugaiTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new Listener());
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
	public void xg1() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
	    //1.��ȷ��ʽ
	 	xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","123.00");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg2() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//2.��ϵ��Ϊ��
		xg.xiugai("","����ʡ�差�з�����","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg3() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//3.��ϵ��Ϊ����
		xg.xiugai("��@#��%����&*","����ʡ�差�з�����","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg4() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//4.��ַΪ��
		xg.xiugai("zhaicunqi","","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg5() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//5.��ַ����
		xg.xiugai("zhaicunqi","��@#��%����&*","111111","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg6() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//6.�ʱ�Ϊ��
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg7() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//7.�ʱ���һλ����
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","12345","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg8() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//8.�ʱ��һλ����
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","1234567","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg9() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//9.�ʱ�Ϊ����
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","��@#��%����","13705487172","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg10() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//10.�绰����Ϊ��
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg11() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//11.�绰������һλ
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","1370548717","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg12() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//12.�绰�����һλ
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","137054871723","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg13() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//13.�绰����Ϊ����
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","��@#��%����&*����~","123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg14() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//14.�۸�Ϊ��
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg15() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//15.�۸�Ϊ��
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","-123.00");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg16() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//16.�۸�Ϊ0
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","0");
		Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void xg17() throws InterruptedException { 
		OrderManagement xg=new OrderManagement(webtest);
		//17.�۸�Ϊ����
		xg.xiugai("zhaicunqi","����ʡ�差�з�����","111111","13705487172","��@#��%����&*");
		Thread.sleep(3000);
	 }
}