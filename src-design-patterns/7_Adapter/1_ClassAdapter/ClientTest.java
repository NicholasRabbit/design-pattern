
/*
* 本例使用类适配器的方式，这种方式不常用，
* 适配器类VoltageAdapter要继承被适配的类Voltage220V，可以重写父类中的方法，具有灵活性。
*
* 需求：
* 用户要用5v的电，但是国家只提供220v电压的电，因此需要使用适配器把220v转换成5v.
* 重点观察VoltageAdapter里的代码。
* 
*/
public class ClientTest {

	public static void main(String[] args){
		MobilePhone mp = new MobilePhone();
		IVoltage5V vt = new VoltageAdapter();
		mp.charging(vt);
	}
}
