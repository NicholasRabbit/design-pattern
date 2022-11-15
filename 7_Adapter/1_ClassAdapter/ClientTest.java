public class ClientTest {

	public static void main(String[] args){
		MobilePhone mp = new MobilePhone();
		IVoltage5V vt = new VoltageAdapter();
		mp.charging(vt);
	}
}