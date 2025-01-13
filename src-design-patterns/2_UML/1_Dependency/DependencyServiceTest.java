/*
一，依赖关系，定义
1，类中用到了对方
2，类中的成员属性
3，方法返回值是一个类
4，方法的形参列表是一个类
5，方法中使用到一个类
以上的情况说明本类对其它类有依赖关系，没有这些依赖，编译都无法通过
*/
//依赖范例
public class DependencyServiceTest {

	private UserDao userDao;
	
	public Car getCar(){
		return null;
	}

	public void save(Person person){
	
	}

	public void ride(){
		Bike bike = new Bike();
	}

	public static void main(String[] args){
	
	}
}