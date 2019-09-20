package com.xxniu.mail;

public class Test {
	public static void main(String[] args) {
		MailOperation operation = new MailOperation();
		String user = "niuxinxing@huaxiafinance.com";
//		String password = "niuxing950210"; //163授权码
		String password = "xxniu950210"; //qq授权码
//		String host = "smtp.163.com";
		String host = "smtp.263xmail.com";
		String from = "niuxinxing@huaxiafinance.com";
//		String to = "3491417165@qq.com";// 收件人
		String to = "zhangpeng@huaxiafinance.com";// 收件人
//		String to = "1260988075@qq.com";// 收件人
		String subject = "test";
		// 邮箱内容
		StringBuffer sb = new StringBuffer();
		sb.append("测试263的25端口！");
//		sb.append("这是我用测试软件给你发的邮件！");
		try {
			String res = operation.sendMail(user, password, host, from, to, subject, sb.toString());
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
