package Other;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail {
	
	public static String messageText="hello";

	public static void main(String[] args) throws Exception {
		 Properties prop = new Properties();
	     prop.setProperty("mail.host", "smtp.163.com");
		 prop.setProperty("mail.transport.protocol", "smtp");
	     prop.setProperty("mail.smtp.auth", "true");		   
	     //ʹ��JavaMail�����ʼ���5������
	     //1������session
         Session session = Session.getInstance(prop);
	     //����Session��debugģʽ�������Ϳ��Բ鿴��������Email������״̬
	     session.setDebug(true);
	      //2��ͨ��session�õ�transport����
	     Transport ts = session.getTransport("smtp");
		  //3��ʹ��������û��������������ʼ��������������ʼ�ʱ����������Ҫ�ύ������û�����У�����smtp���������û��������붼ͨ����֤֮����ܹ����������ʼ����ռ��ˡ�
		 ts.connect("smtp.163.com", "18232663270@163.com", "jh182326632");
		  //4�������ʼ�
		 Message message = createSimpleMail(session,"");
          //Transport.send(message);
          //5�������ʼ�
	     ts.sendMessage(message, message.getAllRecipients());
		 ts.close();
	}
	
	public static MimeMessage createSimpleMail(Session session,String file) throws Exception {
	    Multipart mp = new    MimeMultipart(); 
		//�����ʼ�����
	        MimeMessage message = new MimeMessage(session);
	        //ָ���ʼ��ķ�����
	        message.setFrom(new InternetAddress("18232663270@163.com"));
	        //ָ���ʼ����ռ��ˣ�
	        message.setRecipient(Message.RecipientType.TO , new InternetAddress("1639619416@qq.com"));
	        //�ʼ��ı���
	        message.setSubject("������������ɣ���ע�����");
	        //�ʼ����ı�����
	        message.setContent("���,������������ɣ��ѷ��Ͳ��Ա�����ע�����", "text/html;charset=UTF-8");
	        
	    	DataSource ds = new FileDataSource(file);
			BodyPart bp = new MimeBodyPart();
			bp.setDataHandler(new DataHandler(ds));
			bp.setFileName(file);
			mp.addBodyPart(bp);
			
			
	        message.setContent(mp);
	        //���ش����õ��ʼ�����
	        return message;
	    }
	}