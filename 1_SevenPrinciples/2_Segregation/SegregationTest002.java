
//�Ľ�������ʵ�ֽӿڸ���ԭ��

public class SegregationTest002 {

	public static void main(String[] args){
		
		B b = new B();
		//ֻ����B����������
		User user = new User();
		user.operation1(b);
		user.operation2(b);
		user.operation3(b);
		//Ҳ��ֻ����C����������
		C c = new C();
		Customer customer = new Customer();
		customer.operation1(c);
		customer.operation2(c);
		customer.operation3(c);

	}
}


interface Interface01{
	//����m2()���õ�����˰���������һ���ӿ�
	public abstract void m2();
	
}

//�����ĸ�����Ҳ�ŵ���ͬ�Ľӿ�
interface Interface02{
	public abstract void m1();
	public abstract void m3();
}

interface Interface03{
	public abstract void m4();
	public abstract void m5();
}

//B��ֻ�õ�����m1,m2,m3,ֻ��ʵ�ֽӿ�Interface01/02
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
//C��ֻ�õ�����m2,m4,m5,ֻ��ʵ�ֽӿ�Interface01/03
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
	//User��ͨ���ӿڵ���B,ֻ�õ�m1,m2,m3��������
	public void operation1(Interface02 i){  //ע�⣬�����βνӿ�Ҫ����ΪInterface02,����ͬ��
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
	//Customerͨ���ӿڵ���C,ֻ��m2,m4,m5��������
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

