

/*
* 本例使用对象适配器的方式
* 
* 
*/

public class ClientTest {

	public static void main(String[] args){
		MobilePhone mp = new MobilePhone();
		IVoltage5V vt = new VoltageAdapter(new Voltage220V());
		mp.charging(vt);
	}
}