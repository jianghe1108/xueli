package Xueli;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UserManagementyuangongTest extends BaseTest{
	@BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    TestRunner runner = (TestRunner) context;
	    runner.addListener(new Listener());
	    	}
	//Session session = Session.getInstance(props, new Authenticator() {
	//	public PasswordAuthentication getPasswordAuthentication() { 
		//return new PasswordAuthentication("slp6819094", "123919");
		//}
	//}
	@Test
    public void testBackLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	Thread.sleep(2000);
    	add.inputValues("admin", "admin");
    	Thread.sleep(2000);
    }
	 @Test(dependsOnMethods="testBackLogin")
	public void userM() throws InterruptedException { 
	    UserManagementyuangong userM=new UserManagementyuangong(webtest);
	    userM.inputValues("admin0", "admin0", "admin0", "Ա��", "15732176520", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619410@qq.com","��","������","��ͨԱ��","reset");
	   	Thread.sleep(3000);
	    //1.�������̣��������Ϊ��Ч��ȷ����Ϣ
	 	userM.inputValues("admin1", "admin1", "admin1", "Ա��һ", "15732176521", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619411@qq.com","��","������","��ͨԱ��", "submit");
	   	Thread.sleep(3000);
	   	//2.ѡ����ϢΪŮ�����á���������Ա
	   	userM.inputValues("admin2", "admin2", "admin2", "Ա����", "15732176522", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619412@qq.com","Ů","����","��������Ա", "submit");
	   	Thread.sleep(3000);
	   	//3.�绰��Ϣ��1�ظ�
	   	userM.inputValues("admin3", "admin3", "admin3", "Ա����", "15732176521", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619413@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	   	//4.������Ϣ��1�ظ�
	   	userM.inputValues("admin4", "admin4", "admin4", "Ա����", "15732176524", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619411@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	   	//5.��ַ������ϸ��ַ��ʡ�ݵ�ַ��һ��
	   	userM.inputValues("admin5", "admin5", "admin5", "Ա����", "15732176525", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "������ʡ������","1639619415@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	    //6.��ϸ��ַ��Ϊ�����ڵ�ʡ����Ϣ��ʡ�����м���Ϣ��ƥ��
	   	userM.inputValues("admin6", "admin6", "admin6", "Ա����", "15732176526", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "������ʡ������","1639619416@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	    //7.�����ʽ����ȷ
	   	userM.inputValues("admin7", "admin7", "admin7", "Ա����", "15732176527", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619417@.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	   	//8.�Ժ���д
	 }
	   
}
