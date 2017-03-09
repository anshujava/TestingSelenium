package TestNGReporting_Seleneum;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendAttachmentInEmail {
   public static void main(String[] args) {

		 // Recipient's email ID needs to be mentioned.
	      String to = "anshujava@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "anshuman11@gmail.com";

	      final String username = "anshuman11@gmail.com";//change accordingly
	      final String password = "anshuanshu13";//change accordingly


	      Properties props = new Properties();
	      props.put("mail.smtp.host", "smtp.gmail.com");  
	      props.put("mail.smtp.socketFactory.port", "465");  
	      props.put("mail.smtp.socketFactory.class",  
	                "javax.net.ssl.SSLSocketFactory");  
	      props.put("mail.smtp.auth", "true");  
	      props.put("mail.smtp.port", "465");  

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
	            }
	         });

	      try {
	         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse(to));

	         // Set Subject: header field
	         message.setSubject("Testing Completed");

	         // Create the message part
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	         messageBodyPart.setText("Automation Script Finished. Please find attached output.html");

	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename = ".\\test-output\\html\\output.html";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName("output.html");
	         multipart.addBodyPart(messageBodyPart);
	         
	         MimeBodyPart messageBodyPart2 = new MimeBodyPart(); 
	         DataSource source2 = new FileDataSource(".\\test-output\\html\\failure_12-Nov-2016_13_11_53.jpg"); 
	         messageBodyPart2.setDataHandler( new DataHandler(source2)); 
	         messageBodyPart2.setFileName("failure_12-Nov-2016_13_11_53.jpg"); 
	         multipart.addBodyPart(messageBodyPart2); 

	         // Send the complete message parts
	         message.setContent(multipart);

	         // Send message
	         Transport.send(message);

	         System.out.println("Sent message successfully....");
	  
	      } catch (MessagingException e) {
	         throw new RuntimeException(e);
	      }

}
   
}
