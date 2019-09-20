package com.xxniu.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 发件人账号密码
 * 
 * @author zhangdi
 *
 */
public class MailAuthenticator extends Authenticator {

	public static String USERNAME = "1260988075@qq.com";
	public static String PASSWORD = "xxniu950210";

	public MailAuthenticator() {
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(USERNAME, PASSWORD);
	}

}