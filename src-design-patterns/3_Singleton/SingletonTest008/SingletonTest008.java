

/*
第八种：枚举，推荐使用
此种时使用JDK1.5新增的枚举功能来实现单例模式
优点：
1，可以避免多线程同步问题，保证线程安全；
2，防止反序列化时重新创建新的对象；
3，Effective Java作者推荐。
*/
public class SingletonTest008 {
	
	public static void main(String[] args){
		
		SingletonDemo instance01 = SingletonDemo.INSTANCE;
		SingletonDemo instance02 = SingletonDemo.INSTANCE;
		
		boolean flag = instance01 instanceof SingletonDemo;
		System.out.println("is SingeltonDemo ? ==>" + flag);  //ture
		
		System.out.println("instance01 ==> " + instance01.hashCode());
		System.out.println("instance02 ==> " + instance02.hashCode());	
	}

}

//枚举
enum SingletonDemo {
	//属性
	INSTANCE;

	//方法
	public void doSome(){
		System.out.println("enum method doSome execute!");
	}
}