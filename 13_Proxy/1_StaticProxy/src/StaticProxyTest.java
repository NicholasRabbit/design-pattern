
import java.util.List;
import java.util.ArrayList;

/*
* 静态代理：
* 1，使用一个代理类，来代理另外一个类的方法
* 2，优点：可以在执行被代理的方法之前，添加一些额外的功能，如日志打印等操作
*    缺点：静态代理方式，代理类和被代理类耦合度高，被代理类有功能修改，代理类也要跟着改，不方便。
* 使用动态代理可解决这个缺点。
*/
public class StaticProxyTest {

	public static void main(String[] args){
		UserDaoProxy proxy = new UserDaoProxy(new UserDao());
		List<User> userList = proxy.list(new User());
		for(User u : userList){
			System.out.println(u);
		}
	}

}