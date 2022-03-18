
/*
第七种：静态内部类形式,推荐使用
优点：
1，这种方式采用了类加载机制，保证实例化时只有一个线程，保证了线程安全；
2，静态内部类SingletonInstance在外部类加载时不会立即实例化，只有在调用getInstance()时才会加载并实例化，实现了懒加载；
3，类的静态属性在第一次加载类时实例化，JVM保证了线程安全性；
总结，此方式实现了懒加载，线程安全和效率。推荐。
*/
public class SingletonTest007 {
	
	public static void main(String[] args){
		SingletonDemo instance01 = SingletonDemo.getInstance();
		SingletonDemo instance02 = SingletonDemo.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);	
	}

}

class SingletonDemo {
	
	//私有静态属性，只在第一次加载类的时候实例化，保证了线程安全
	private static volatile SingletonDemo instance;
	//构造方法私有化
	private SingletonDemo(){
	
	}

	//创建一个静态内部类，这个静态内部类，在外部类加载时不会加载，只有使用时才会加载
	private static class SingletonInstance {
		//当静态内部类加载时，会实例化，创建INSTANCE对象
		private static final SingletonDemo INSTANCE = new SingletonDemo();
	}

	//对外提供公共方法，返回实例化的对象
	public static SingletonDemo getInstance(){
		return SingletonInstance.INSTANCE;  //这句执行时，静态内部类才会加载，实现了懒加载的效果
	}


}