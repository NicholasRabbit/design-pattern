/*
1,使用依赖倒转原则，即面向接口编程
2,依赖倒转就是，原先依赖具体的实现类，改为依赖接口，此为倒转
3,因为实现类是不同的，而接口是相同的，因此不必关系具体类的实现，只需调用接口即可，多态用法，减少了耦合程度
*/
public class InversionTest002 {

	public static void main(String[] args){
		Person p = new Person();
		IReciever r1 = new Email();
		p.send(r1);
		//使用依赖倒转，面向接口编程之后，增加微信消息只需写个微信类实现IReciever接口就行
		//不用改动Person.java里的代码了
		IReciever r2 = new WeChat();
		p.send(r2);
	}
}

class Person {
	//这里就是依赖的接口
	public void send(IReciever reciever){
		System.out.println(reciever.getInfo());
	}
}


interface IReciever {
	public abstract String getInfo();
}

class Email implements IReciever {
	
	public String getInfo(){
		return "邮件消息！";
	}
}

class WeChat implements IReciever {
	public String getInfo(){
		return "微信消息！";
	}
}