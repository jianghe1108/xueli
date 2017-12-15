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
         //使用JavaMail发送邮件的5个步骤
         //1、创建session
         Session session = Session.getInstance(prop);
         //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
         session.setDebug(true);
         //2、通过session得到transport对象
         Transport ts = session.getTransport();
         //3、连上邮件服务器
         ts.connect("18232663270@163.com", "jh182326632");
         //4、创建邮件
         Message message = createAttachMail(session);
         //5、发送邮件
         ts.sendMessage(message, message.getAllRecipients());
         ts.close();
     }
     
     public  MimeMessage createAttachMail(Session session) throws Exception{
        MimeMessage message = new MimeMessage(session);
         
         //设置邮件的基本信息      
         //发件人
         message.setFrom(new InternetAddress("18232663270@163.com"));
         //收件人
         message.setRecipient(Message.RecipientType.TO, new InternetAddress("1639619416@qq.com"));
         //标题
         message.setSubject("自动化测试完成提醒");
         message.setText("自动化测试完成，测试结果请注意查收。"); 
         //创建邮件正文，为了避免邮件正文中文乱码问题，需要使用charset=UTF-8指明字符编码
         MimeBodyPart text = new MimeBodyPart();
         text.setContent("老师您好，我是姜赫，我的测试用例已执行完毕，现将结果发送至您的邮箱", "text/html;charset=UTF-8");        
         //创建邮件附件
         MimeBodyPart attach = new MimeBodyPart();
         DataHandler dh = new DataHandler(new FileDataSource("D:/workspace/xueli/report.zip"));
         attach.setDataHandler(dh);
         attach.setFileName(dh.getName());  
         
         //创建容器描述数据关系
         MimeMultipart mp = new MimeMultipart();
         mp.addBodyPart(text);
         mp.addBodyPart(attach);
         mp.setSubType("mixed");
         
         message.setContent(mp);
         message.saveChanges();

         return message;
     }
 }
