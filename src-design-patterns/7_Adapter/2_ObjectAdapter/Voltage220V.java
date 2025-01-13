/**
* 22v电压类，此电压不能别手机直接使用，需要适配
*/
public class Voltage220V {
	
	//输出电压的方法
	public int output220V(){
		int outputPower = 220;
		System.out.println("输出电压(V)：" + outputPower);
		return outputPower;
	}

}