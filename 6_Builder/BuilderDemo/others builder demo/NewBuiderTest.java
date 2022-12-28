
/*
* 本例使用的是一种改进的建造的模式，实际还是跟传统的建造者模式思路是一样的。
* JeeSite范例也是用的这种改进的形式。
*/
public class NewBuiderTest {

	public static void main(String[] args){
		
		PersonalComputer computer = new PersonalComputer.Builder("因特尔","三星")
        .setDisplay("三星24寸")
        .setKeyboard("罗技")
        .setUsbCount(2)
        .build();

		System.out.println(computer);
	}
}