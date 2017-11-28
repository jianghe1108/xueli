package UserManagement;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) throws Exception {
		 Properties prop = new Properties();
	     prop.setProperty("mail.host", "smtp.163.com");
		 prop.setProperty("mail.transport.protocol", "smtp");
	     prop.setProperty("mail.smtp.auth", "true");		   
	     //使用JavaMail发送邮件的5个步骤
	     //1、创建session
        Session session = Session.getInstance(prop);
	     //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
	     session.setDebug(true);
	      //2、通过session得到transport对象
	     Transport ts = session.getTransport("smtp");
		  //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和校验码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
		 ts.connect("smtp.163.com", "18232663270@163.com", "jh182326632");
		  //4、创建邮件
		 Message message = createSimpleMail(session);
          //Transport.send(message);
          //5、发送邮件
	     ts.sendMessage(message, message.getAllRecipients());
		 ts.close();
	}
	 public static MimeMessage createSimpleMail(Session session)
	            throws Exception {
	        //创建邮件对象
	        MimeMessage message = new MimeMessage(session);
	        //指明邮件的发件人
	        message.setFrom(new InternetAddress("18232663270@163.com"));
	        //指明邮件的收件人，
	        message.setRecipient(Message.RecipientType.TO , new InternetAddress("1639619416@qq.com"));
	        //邮件的标题
	        message.setSubject("测试用例已完成，请注意查收");
	        //邮件的文本内容
	        message.setContent("你好", "text/html;charset=UTF-8");
	        //返回创建好的邮件对象
	        return message;
	    }
	}