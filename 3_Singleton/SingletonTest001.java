
//一，单例模式第一种写法：饿汉式
public class SingletonTest001 {
	
	public static void main(String[] args){
		SingletonDemo instance01 = SingletonDemo.getInstance();
		SingletonDemo instance02 = SingletonDemo.getInstance();
		System.out.println("instance01 hashCode==>" + instance01.hashCode());
		System.out.println("instance02 hashCode==>" + instance02.hashCode());
	}
}


class SingletonDemo {
	//1,声明静态常量，类加载时就创建对象
	private static final SingletonDemo instance = new SingletonDemo();
	//2,构造方法私有化，防止外部创建对象
	private SingletonDemo(){

	}
	//3，写一个静态方法，返回对象
	public static SingletonDemo getInstance(){
		return instance;
	}
}