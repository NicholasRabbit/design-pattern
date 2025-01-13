/*
* 适配器类，
* 适配器类和被适配的类Voltage220V是聚合关系，这样的好处是避免重写父类中的方法，符合七大原则之里氏替换原则
*/
public class VoltageAdapter implements IVoltage5V {
	
	private Voltage220V vt220;  //聚合的关系，不再是类适配器中的继承（泛化）关系了。
	
	public VoltageAdapter (){
	
	}
	public VoltageAdapter (Voltage220V vt220){
		this.vt220 = vt220;  
	}

	
	//把220v转换为5v
	public int output5V(){
		if(vt220 != null){
			//这里使用属性直接调用其方法。
			int inputPower = vt220.output220V();  
			//转换为5v，适配器重点就是在这里进行转换。
			int outputPower = inputPower / 44;  
			return outputPower;  
		}
		System.out.println("转换失败，无输入电源");
		return -1;
	}

}