public abstract class Vehicle{
	
	protected String carMake;  //车型号

	public abstract void prepare();  //准备指定车型所需的材料,不同的车不同

	//制造汽车步骤
	//1,nc加工
	public void cnc(){
		System.out.println(carMake + "==>CNC");	
	}
	//2,购买组件
	public void buyComponent(){
		System.out.println(carMake + "==>buy component");
	}
	//3,组装
	public void assembly(){
		System.out.println(carMake + "==>Assembley");
	}

	public void setCarMake(String carMake){
		this.carMake = carMake;
	}
}
