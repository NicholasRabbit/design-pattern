
/*
第三种，懒汉式（线程不安全）

线程不安全范例：
如果有多个线程，一个线程走到if(instance == null)正在判断，还没有新建对象，另一个已经判断过了，新建了一个对象，那就有两个对象实例了。

*/
public class SingletonTest003B{
	public static void main(String[] args){
		
		/* 这里不要获取实例，否则就已经有对象了，无法测试效果
		SingletonDemo03 instance01 = SingletonDemo03.getInstance();
		SingletonDemo03 instance02 = SingletonDemo03.getInstance();
		System.out.println("instance01 ==> " + instance01);
		System.out.println("instance02 ==> " + instance02);	
		*/
		
		//多线程同时获取instance，查看这种单例模式的线程不安全问题
		Runnable mr = new MyThread();
		for(int i=0; i<100; i++){
			Thread t = new Thread(mr);
			t.start();
		}
	}
}

class SingletonDemo03 {
	private static SingletonDemo03 instance;
	private SingletonDemo03(){
	
	}
	//获取实例的静态方法，只有在调用该方法时，才会创建对象
	public static SingletonDemo03 getInstance(){
		if(instance == null){
			//在判断实例为空后，休眠下线程，模拟阻塞
			try{
				Thread.sleep(200);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			instance = new SingletonDemo03();
			//return instance;   //这里不用写return,代码不够简洁优化
		}
		return instance;
	}
}

class MyThread implements Runnable {
	private SingletonDemo03 instance;
	public void run(){
		instance = SingletonDemo03.getInstance();
		System.out.println(Thread.currentThread().getName() + " instance ==> " + instance);
	}
}