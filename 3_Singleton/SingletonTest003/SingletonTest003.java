
/*
第三种，懒汉式（线程不安全），不推荐使用
优点：
起到了懒加载的效果
缺点：
线程不安全，只能在单线程下使用，
如果有多个线程(SingletonTest003B.java)，一个线程走到if(instance == null)正在判断，还没有新建对象，另一个已经判断过了，新建了一个对象，那就有两个对象实例了。

*/
public class SingletonTest003{
	public static void main(String[] args){
		SingletonDemo03 instance01 = SingletonDemo03.getInstance();
		SingletonDemo03 instance02 = SingletonDemo03.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);	
	}
}

class SingletonDemo03 {
	
	private static SingletonDemo03 instance;
	
	private SingletonDemo03(){
	
	}
	//获取实例的静态方法，只有在调用该方法时，才会创建对象
	public static SingletonDemo03 getInstance(){
		if(instance == null){
			instance = new SingletonDemo03();
			//return instance;   //这里不用写return,代码不够简洁优化
		}
		return instance;
	}
}
