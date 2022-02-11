/*
接口隔离原则：
客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖，应该建立在最小的接口上
1,例，如果A接口有五个方法，B,C类是其实现类，B类只需要用其中3个，C类只需要2个，但是实现A接口就得全部实现其方法
2,解决方案，把接口拆分为多个接口，每个接口中有不同的方法
*/

//本例演示接口没隔离的情况，查看其弊端：代码冗余
//在002中进行改进

public class SegregationTest001 {

	public static void main(String[] args){
		
		Interface01 b = new B();
		//只用了B的三个方法
		User user = new User();
		user.operation1(b);
		user.operation2(b);
		user.operation3(b);
		//也是只用了C的三个方法
		Interface01 c = new C();
		Customer customer = new Customer();
		customer.operation1(c);
		customer.operation2(c);
		customer.operation3(c);

	}
}


interface Interface01{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
	public abstract void m5();
}

class B implements Interface01 {
	public void m1(){
		System.out.println("B:m1 ==> execute");
	}
	
	public void m2(){
		System.out.println("B:m2 ==> execute");
	}
	
	public void m3(){
		System.out.println("B:m3 ==> execute");
	}
	
	public void m4(){
		System.out.println("B:m4 ==> execute");
	}
	
	public void m5(){
		System.out.println("B:m5 ==> execute");
	}
}

class C implements Interface01 {
	public void m1(){
		System.out.println("C:m1 ==> execute");
	}
	
	public void m2(){
		System.out.println("C:m2 ==> execute");
	}
	
	public void m3(){
		System.out.println("C:m3 ==> execute");
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
	public void operation1(Interface01 i){
		i.m1();
	}
	public void operation2(Interface01 i){
		i.m2();
	}
	public void operation3(Interface01 i){
		i.m3();
	}
}

class Customer {
	//Customer通过接口调用C,只用m2,m4,m5三个方法
	public void operation1(Interface01 i){
		i.m2();
	}
	public void operation2(Interface01 i){
		i.m4();
	}
	public void operation3(Interface01 i){
		i.m5();
	}
}

