

/*
* 解释器模式：
* 1，高级语言的编译器就是一种解释器模式；
* 2，本例写个模拟的解释器，把购票人的信息翻一下，看是否符合免票要求。
* 定义翻译规则：
* 景区的规则是：只有天津市，北京市这两个地方的或者老人，医生，小孩才免票。
* 用户信息中包含冒号":"和"-"，冒号分割级别高，可得到城市信息，短划线级别低一级分割后得到用户类型
* 例：北京:小明-医生
* 
*/
public class InterpreterTest {

	public static void main(String[] args){
		
		ScenicArea area = new ScenicArea();

		area.getTicket("北京:小明-工人");

		area.getTicket("石家庄:小明-老人");

	}

}
