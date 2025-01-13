/*
�ӿڸ���ԭ��
�ͻ��˲�Ӧ������������Ҫ�Ľӿڣ���һ�������һ�����������Ӧ�ý�������С�Ľӿ���
1,�������A�ӿ������������B,C������ʵ���࣬B��ֻ��Ҫ������3����C��ֻ��Ҫ2��������ʵ��A�ӿھ͵�ȫ��ʵ���䷽��
2,����������ѽӿڲ��Ϊ����ӿڣ�ÿ���ӿ����в�ͬ�ķ���
*/

//������ʾ�ӿ�û�����������鿴��׶ˣ���������
//��002�н��иĽ�

public class SegregationTest001 {

	public static void main(String[] args){
		
		Interface01 b = new B();
		//ֻ����B����������
		User user = new User();
		user.operation1(b);
		user.operation2(b);
		user.operation3(b);
		//Ҳ��ֻ����C����������
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
	//User��ͨ���ӿڵ���B,ֻ�õ�m1,m2,m3��������
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
	//Customerͨ���ӿڵ���C,ֻ��m2,m4,m5��������
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

