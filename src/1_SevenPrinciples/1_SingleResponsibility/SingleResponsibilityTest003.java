/*
�������2�ģ��ڷ�������ִ�е�һְ��ԭ����Ȼһ��Ҫ�������������ְ�𣬵��ǵ����ܲ��Ǻܶ�ʱ��ʹ�÷���������Ҳ���ԡ�
*/

public class SingleResponsibilityTest003 {
	
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.run("����");
		v.fly("�ɻ�");
		v.cruise("�ִ�");
	}
}

class Vehicle{
	//��дһ���������ֵ�ְ��
	public void run(String vehicle){
		System.out.println(vehicle + "==>�ڹ�·���ܡ�");
	}

	public void fly(String vehicle){
		System.out.println(vehicle + "==>�����Ϸɡ�");
	}

	public void cruise(String vehicle){
		System.out.println(vehicle + "==>��ˮ�ﺽ�С�");
	}


}