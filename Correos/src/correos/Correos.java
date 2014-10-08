/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package correos;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Correos {
    

    
    public static void main(String[] args) {
        try{
            //Propiedades de la conexion
            Properties props= new Properties();
            props.setProperty("mail.smtp.host","smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port","587");
            props.setProperty("mail.smtp.user","tareaprogramada.estruct@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            
            //Preparamos la sesion
            Session session=Session.getDefaultInstance(props);
            
            //Construimos el mensaje
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress("stephaniediazv@gmail.com"));
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress("stephaniediazv@hotmail.com"));
            message.setSubject("Ficha del Banco");
            message.setText(
                "mensajito con java mail<br>"+"de los buenos"+" porque si",
                        "ISO-8859-1","html");
            
            //lo enviamos
            Transport t= session.getTransport("smtp");
            t.connect("tareaprogramada.estruct@gmail.com", "tareaprogra");
            t.sendMessage(message, message.getAllRecipients());
            
            //cierre
            t.close();
       }
       catch (Exception e)
       {
                e.printStackTrace();
                
                
       }
    }
            
}
   
    

