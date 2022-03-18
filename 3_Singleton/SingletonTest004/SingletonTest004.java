
/*
第四种方式：懒汉式（线程安全，同步方法），不推荐使用
优点：
解决了线程安全问题
缺点：
每次获取实例的方法getInstance()都是同步的，实际这个方法只执行一次就够了，效率不高
*/
public class SingletonTest004 {
	public static void main(String[] args){
		SingletonDemo04 instance01 = SingletonDemo04.getInstance();
		SingletonDemo04 instance02 = SingletonDemo04.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);	
	}
}

class SingletonDemo04 {
	private static SingletonDemo04 instance;
	private SingletonDemo04 (){
	
	}
	//使用同步方法，保证线程安全
	public static synchronized SingletonDemo04 getInstance(){
		if(instance == null){
			instance = new SingletonDemo04();
		}
		return instance;
	}
}