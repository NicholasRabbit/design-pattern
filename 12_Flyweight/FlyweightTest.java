
//享元模式测试类
//体现享元模式的核心代码在BigCharFactory.java里。
public class FlyweightTest {

	/*
	* 命令行运行的时候，输入数字：java FlyweightTest 123
	*/
	public static void main(String[] args){
		
		//判断用户是否输入数字
		if(args.length == 0){
			System.out.println("java Main digits.Such as '123'");
			System.exit(0);
		}
		//调用BigString有参构造
		BigString bs = new BigString(args[0]);
		bs.print();
		
	}
}