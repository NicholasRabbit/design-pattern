
//不遵守依赖倒转原则的例子，看看其弊端，在002中改善
/*
开始代码是只发送电子邮件，后来增加发送微信，就得在Person里增加代码，耦合性太强
*/
public class InversionTest001 {

	public static void main(String[] args){
		//只发送电子邮件
		Email email = new Email();
		email.setInfo("发送一封电子邮件");
		Person p = new Person();
		p.send(email);
		//增加发送微信消息功能
		WeChat weChat = new WeChat();
		weChat.setInfo("发送微信消息");
		p.send02(weChat);
	}
}

class Person {

	public void send(Email email) {
		System.out.println(email.getInfo());
	}
	//新增发送微信的话就得在Person里增加新方法，增加的代码
	public void send02(WeChat weChat){
		System.out.println(weChat.getInfo());
	}
}

class Email {
	
	private String info;

	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return this.info;
	}
}

class WeChat {
	private String info;

	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return this.info;
	}
}
