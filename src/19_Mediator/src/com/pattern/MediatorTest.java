

package com.pattern;

import com.pattern.colleague.*;
import com.pattern.mediator.*;



/*
* 案例：
* 例：Colleague:A,B,C这多个类之间发送消息，如果不使用中介者模式，A的类中要分别写给BC发送消息的代码，
*     其它类同理，这样彼此之间的联系成网状结构了，耦合性极强。
* 改善：
* 使用中介者模式，ABC都注册到中介者里，A发送消息给中介者，中介者再把消息发送给其它类。
* 在中介者类里一个员工发送消息，是发送给其他同事(Colleague)，不用发送给自己。
*/
public class MediatorTest {

	public static void main(String[] args){
		
		Mediator mediator = new ConcreteMediator();
		//注意所有“同事”都要注册到中介者里。否则收不到消息。
		Colleague feiq = new Feiqiu("Feiqiu",mediator);
		Wechat wechat = new Wechat("Wechat",mediator);
		feiq.sendMsg("Hello,I'm a msg from Feiqiu");
		wechat.sendMsg("Hi there,I'm a msg from Wechat");

		/*
		* 使用中介者模式后，扩展就很容易了，如价格Skype类，接受或发送消息
		* 直接继承Colleague，然后注册到中介者即可，原来的“同事”内部代码根本不用改。
		*/
		Skype skype = new Skype("Skype",mediator);
		System.out.println("======Skype注册后=======");
		feiq.sendMsg("Hello,I'm a msg from Feiqiu");
		skype.sendMsg("Hi,I'm a msg from Skype");
	}

}