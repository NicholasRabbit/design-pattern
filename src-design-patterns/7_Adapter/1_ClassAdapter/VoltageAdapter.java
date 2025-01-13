/*
*适配器类
*/
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
	
	//把220v转换为5v
	public int output5V(){
		//因为本类继承了父类Voltage220v，所以有父类中的output220V()的方法，这里直接得到220V的返回值
		int inputPower = output220V(); 
		//转换为5v，适配器重点就是在这里进行转换。
		//实际开发中这里写对应的转换功能，例如调用其它接口，等等。
		int outputPower = inputPower / 44;  
		return outputPower;  
	}

}
