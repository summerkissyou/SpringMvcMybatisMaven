package com.sun.demo.advance.mail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EmailTest {
	@Test  
    public void sendEmail() throws Exception {  
        String userName = "871889325@qq.com"; // 发件人QQ邮箱  
        String password ="lvogbhpaojeubaid";//激活POP3/SMTP服务的授权码
        String smtpHost = "smtp.qq.com"; // 邮件服务器  
        String fromName="哥只是个传说";//发件人名称
        String to = "826853123@qq.com"; // 收件人的邮箱账号，多个收件人以半角逗号分隔  
        String cc = "3386747718@qq.com"; //抄送，多个抄送以半角逗号分隔  
        String subject = "测试JAVA发邮件代码?"; // 主题  
        String body = "JAVA给邮箱发信息的代码.."; // 正文，可以用html格式的哟  
       // 附件的路径是文件在你电脑上的绝对路径,多个附件以逗号分开
        List<String> attachments = Arrays.asList("C:\\Users\\ming\\Pictures\\Camera Roll\\m6.jpg","C:\\Users\\ming\\Pictures\\Camera Roll\\m7.jpg"); 
		Email email = Email.entity(smtpHost, userName, password, to, cc, subject, body, attachments,fromName);  
        email.send(); // 发送！  
    }  

}
