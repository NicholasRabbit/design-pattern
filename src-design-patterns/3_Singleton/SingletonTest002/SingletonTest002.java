
/*
二，单例模式第二种写法，饿汉式(静态代码块),不推荐使用
此种方式的优缺点和第一种一样
*/
public class SingletonTest002 {
	public static void main(String[] args){
		SingletonDemo02 instance01 = SingletonDemo02.getInstance();
		SingletonDemo02 instance02 = SingletonDemo02.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);
	}
}

class SingletonDemo02 {
	
	private static SingletonDemo02 instance;
	
	private SingletonDemo02 (){
	
	}
	//在静态代码块内，新建对象即可
	static {
		instance = new SingletonDemo02();
	}
	//对外提供公共方法，获取单例对象
	public static SingletonDemo02 getInstance(){
		return instance;
	}
}