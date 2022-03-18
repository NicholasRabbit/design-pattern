
/*
第五种，懒汉式（静态代码块），
优缺点同第四种同步方法的形式，不推荐使用
*/
public class SingletonTest005 {
	public static void main(String[] args){
		SingletonDemo instance01 = SingletonDemo.getInstance();
		SingletonDemo instance02 = SingletonDemo.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);	
	}
}

//单例
class SingletonDemo {
	//静态私有变量
	private static SingletonDemo instance;
	//构造方法私有化
	private SingletonDemo(){
	
	}
	//使用静态代码块
	public static SingletonDemo getInstance(){
		if(instance == null){
			//这里锁住SingletonDemo.class,不能锁instance,如果instance是null会报错
			synchronized(SingletonDemo.class){   
				//不加双重检查（对比SingletonTest006）容易出现的问题：
				//如果不加第二次检查，有可能一个线程刚进行检查完instance==null的操作，另一个早点的线程执行完了同步代码块，创建了instance，这样就会产生多个实例
				instance = new SingletonDemo(); 
			}
		}
		return instance;
	}
}