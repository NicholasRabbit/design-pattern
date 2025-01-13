
//改进方案，实现接口隔离原则

public class SegregationTest002 {

	public static void main(String[] args){
		
		B b = new B();
		//只用了B的三个方法
		User user = new User();
		user.operation1(b);
		user.operation2(b);
		user.operation3(b);
		//也是只用了C的三个方法
		C c = new C();
		Customer customer = new Customer();
		customer.operation1(c);
		customer.operation2(c);
		customer.operation3(c);

	}
}


interface Interface01{
	//方法m2()都用到，因此把它单独放一个接口
	public abstract void m2();
	
}

//另外四个方法也放到不同的接口
interface Interface02{
	public abstract void m1();
	public abstract void m3();
}

interface Interface03{
	public abstract void m4();
	public abstract void m5();
}

//B类只用到方法m1,m2,m3,只需实现接口Interface01/02
class B implements Interface01,Interface02 {
	public void m1(){
		System.out.println("B:m1 ==> execute");
	}
	
	public void m2(){
		System.out.println("B:m2 ==> execute");
	}
	
	public void m3(){
		System.out.println("B:m3 ==> execute");
	}
}
//C类只用到方法m2,m4,m5,只需实现接口Interface01/03
class C implements Interface01,Interface03 {
	
	public void m2(){
		System.out.println("C:m2 ==> execute");
	}
	
	public void m4(){
		System.out.println("C:m4 ==> execute");
	}
	
	public void m5(){
		System.out.println("C:m5 ==> execute");
	}
}


class User {
	//User类通过接口调用B,只用到m1,m2,m3三个方法
	public void operation1(Interface02 i){  //注意，这里形参接口要更改为Interface02,下面同理
		i.m1();
	}
	public void operation2(Interface01 i){
		i.m2();
	}
	public void operation3(Interface02 i){
		i.m3();
	}
}

class Customer {
	//Customer通过接口调用C,只用m2,m4,m5三个方法
	public void operation1(Interface01 i){
		i.m2();
	}
	public void operation2(Interface03 i){
		i.m4();
	}
	public void operation3(Interface03 i){
		i.m5();
	}
}

