package Other;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.testng.annotations.Test;

 public class SendEmail {
 
     /**
      * @param args
     * @throws Exception 
     */
     
     @Test
     public void send()  throws Exception {
    	 Properties prop = new Properties();
    	 prop.setProperty("mail.host", "smtp.163.com");
         prop.setProperty("mail.transport.protocol", "smtp");
         prop.setProperty("mail.smtp.auth", "true");
         prop.setProperty("mail.smtp.port", "25");
         //ʹ��JavaMail�����ʼ���5������
         //1������session
         Session session = Session.getInstance(prop);
         //����Session��debugģʽ�������Ϳ��Բ鿴��������Email������״̬
         session.setDebug(true);
         //2��ͨ��session�õ�transport����
         Transport ts = session.getTransport();
         //3�������ʼ�������
         ts.connect("18232663270@163.com", "jh182326632");
         //4�������ʼ�
         Message message = createAttachMail(session);
         //5�������ʼ�
         ts.sendMessage(message, message.getAllRecipients());
         ts.close();
     }
     
     public  MimeMessage createAttachMail(Session session) throws Exception{
        MimeMessage message = new MimeMessage(session);
         
         //�����ʼ��Ļ�����Ϣ      
         //������
         message.setFrom(new InternetAddress("18232663270@163.com"));
         //�ռ���
         message.setRecipient(Message.RecipientType.TO, new InternetAddress("1639619416@qq.com"));
         //����
         message.setSubject("�Զ��������������");
         message.setText("�Զ���������ɣ����Խ����ע����ա�"); 
         //�����ʼ����ģ�Ϊ�˱����ʼ����������������⣬��Ҫʹ��charset=UTF-8ָ���ַ�����
         MimeBodyPart text = new MimeBodyPart();
         text.setContent("��ʦ���ã����ǽ��գ��ҵĲ���������ִ����ϣ��ֽ������������������", "text/html;charset=UTF-8");        
         //�����ʼ�����
         MimeBodyPart attach = new MimeBodyPart();
         DataHandler dh = new DataHandler(new FileDataSource("D:/workspace/xueli/report.zip"));
         attach.setDataHandler(dh);
         attach.setFileName(dh.getName());  
         
         //���������������ݹ�ϵ
         MimeMultipart mp = new MimeMultipart();
         mp.addBodyPart(text);
         mp.addBodyPart(attach);
         mp.setSubType("mixed");
         
         message.setContent(mp);
         message.saveChanges();

         return message;
     }
 }
