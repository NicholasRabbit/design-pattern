
//��һְ��ԭ��һ��Ҫ������Ĳ���ʵ��ְ������֣�����ʱҲ�����ڷ����Ĳ���ʵ�֣�����003��

//��һְ��ԭ����1������ģ�ⲻ���ص�һְ����ֵ�����
//�������ֵ����⣺һ������̫��ְ�����������ɻ��ڹ�·���ܡ�����Ȼ����
//���������002����һ���ฺ��һ��ְ�𣬼����ص�һְ��ԭ��
public class SingleResponsibilityTest001 {
	
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.run("����");
		v.run("�ɻ�");
		v.run("�ִ�");
	}
}

class Vehicle{

	public void run(String vehicle){
		System.out.println(vehicle + "==>�ڹ�·���ܡ�");
	}
}