package com.xxniu.mail;

import org.junit.Test;

public class TestMail {
	@Test
	public void test() {
		MailOperation operation = new MailOperation();
		String user = "liuying-0210@qq.com";
//		String password = "niuxing950210"; //163授权码
		String password = "tujksqtfycfqjcia"; //qq授权码
//		String host = "smtp.163.com";
		String host = "smtp.qq.com";
		String from = "liuying-0210@qq.com";
//		String to = "3491417165@qq.com";// 收件人
		String to = "813946919@qq.com";// 收件人
//		String to = "1260988075@qq.com";// 收件人
		String subject = "test";
		// 邮箱内容
		StringBuffer sb = new StringBuffer();
		sb.append("这是我用测试软件给你发的邮件！");
		try {
			String res = operation.sendMail(user, password, host, from, to, subject, sb.toString());
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
