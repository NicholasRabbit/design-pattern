public class MobilePhone {

	public void charging(IVoltage5V vt){
		//对充电电压进行判断
		if(vt.output5V() > 5){
			System.out.println("充电电压过大");
		}else if(vt.output5V() == 5){
			System.out.println("充电成功" + vt.output5V() + "V");
		}
	}
}