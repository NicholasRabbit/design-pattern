
//一，单例模式第一种写法：饿汉式（静态常量）,不推荐使用
/*
*这种单例模式优点：
*1，写法简单，在类加载时就创建了对象，避免了线程安全问题
*缺点：
*1，没有懒加载lazy loading，在类加载时就实例化，然后调用getInstance()方法获取对象，
    因为导致类加载的原因有很多，不确定是否有其它方式干扰也导致类加载
*2，有可能本次任务对象用不到，就会造成内存浪费，一个对象还可以，一个项目中有多个单例对象没使用就太占内存了
*/
public class SingletonTest001 {
	
	public static void main(String[] args){
		SingletonDemo instance01 = SingletonDemo.getInstance();
		SingletonDemo instance02 = SingletonDemo.getInstance();
		System.out.println("instance01 hashCode==>" + instance01.hashCode());
		System.out.println("instance02 hashCode==>" + instance02.hashCode());
	}
}


class SingletonDemo {
	//1,声明静态常量，并赋值，类加载时就创建对象
	private static final SingletonDemo instance = new SingletonDemo();
	//2,构造方法私有化，防止外部创建对象
	private SingletonDemo(){

	}
	//3，写一个静态方法，返回对象
	public static SingletonDemo getInstance(){
		return instance;
	}
}