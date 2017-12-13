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
     	assertTrue(webtest.getHtmlSource().contains("��ӭ����,"));
    }
	@Test(dependsOnMethods="testBackLogin")
	public void addY1() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	    //1.�������̣��������Ϊ��Ч��ȷ����Ϣ
	    addY.addyuangong("admin1", "admin1", "admin1", "Ա��һ", "15732176521", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619411@qq.com","��","������","��ͨԱ��", "submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY2() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//2.ѡ����ϢΪŮ�����á���������Ա
	    addY.addyuangong("admin2", "admin2", "admin2", "Ա����", "15732176522", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619412@qq.com","Ů","����","��ͨԱ��", "submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY3() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//3.�绰��Ϣ��1�ظ�
	    addY.addyuangong("admin3", "admin3", "admin3", "Ա����", "15732176521", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619413@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY4() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//4.������Ϣ��1�ظ�
	    addY.addyuangong("admin4", "admin4", "admin4", "Ա����", "15732176524", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619411@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY5() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//5.��ַ������ϸ��ַ��ʡ�ݵ�ַ��һ��
	    addY.addyuangong("admin5", "admin5", "admin5", "Ա����", "15732176525", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "������ʡ������","1639619415@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY6() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	    //6.��ϸ��ַ��Ϊ�����ڵ�ʡ����Ϣ��ʡ�����м���Ϣ��ƥ��
	    addY.addyuangong("admin6", "admin6", "admin6", "Ա����", "15732176526", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "������ʡ������","1639619416@qq.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY7() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	    //7.�����ʽ����ȷ
	    addY.addyuangong("admin7", "admin7", "admin7", "Ա����", "15732176527", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619417@.com","Ů","����","��ͨԱ��","submit");
	   	Thread.sleep(3000);
	 }
	@Test(dependsOnMethods="testBackLogin")
	public void addY8() throws InterruptedException { 
	    UserManagementyuangong addY=new UserManagementyuangong(webtest);
	   	//8.������ð�ť
	    addY.addyuangong("admin0", "admin0", "admin0", "Ա��", "15732176520", "�ӱ�ʡ", "ʯ��ׯ��", "ԣ����", "�ӱ�ʡʯ��ׯ��","1639619410@qq.com","��","������","��ͨԱ��","reset");
	   	Thread.sleep(3000);
	 }
}
