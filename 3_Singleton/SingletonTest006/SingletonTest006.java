
/*
第六种，双重检查，推荐使用
在第五种的基础上增加了一次检查instance == null
优点：
1，进行了两次检查，保证了线程安全
2，实例化只进行了一次，避免反复执行
3，延迟加载，效率高，省内存
*/
public class SingletonTest006 {
	public static void main(String[] args){
		SingletonDemo instance01 = SingletonDemo.getInstance();
		SingletonDemo instance02 = SingletonDemo.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);	
	}
}


class SingletonDemo {
	//增加volatile修饰，使其内存可见
	private static volatile SingletonDemo instance;
	//构造方法私有化
	private SingletonDemo(){
	
	}
	public static SingletonDemo getInstance(){
		
		//第一次检查(A)
		if(instance == null){
			synchronized (SingletonDemo.class){
				//第二次检查，
				//如果不加第二次检查，有可能一个线程刚进行检查完(A)处instance==nul的操作，
				//另一个早点的线程执行完了同步代码块，创建了instance，这样就会产生多个实例
				if(instance == null){
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}

}