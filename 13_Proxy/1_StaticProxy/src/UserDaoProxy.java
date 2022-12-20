
import java.util.List;
import java.util.ArrayList;

//代理对象，采用静态代理的方式，把IUserDao聚合进来，代理它的方法
public class UserDaoProxy {

	IUserDao userDao;

	public UserDaoProxy(){
	
	}

	public UserDaoProxy(IUserDao userDao){
		this.userDao = userDao;
	}
	
	//在这里使用UserDao对象来执行查询功能。
	public List<User> list(User user){
		System.out.println("代理类的其他功能执行……");
		return userDao.list(user);
	}

}