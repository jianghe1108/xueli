package UserManagement;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{
	
		//Testָ����ÿһ����������
		public void onTestFailure(ITestResult result){
		//����
		}
		public void onTestSkipped(ITestResult result){
			
		}
		public void onTestSuccess(ITestResult result){
			System.out.println("ִ�гɹ���");
			
		}
		public void onTestStart(ITestResult result){
			
		}
		//3.��������������testng.xml�е�,test��ǩ��ʼǰ����ִ��
		public void onStart(ITestContext content){
			
		}
		@Override
		public void onFinish(ITestContext content){
			System.out.println("����ִ����ϣ������ʼ�");
			
		}	
		
	}