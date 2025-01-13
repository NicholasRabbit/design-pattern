public class Benz extends Saloon {
	
	
	public Benz(){
	
	}
	public Benz(String brand){
		this.brand = brand;    //继承了父类的公共属性，注意如果是父类的私有属性则不可被继承。
	}

	public void start(){
		System.out.println(this.brand + " start");	
	}
	public void transmit(){
		System.out.println(this.brand + " transmit");
	}
	public void accelerate(){
		System.out.println(this.brand + " accelerate");
	}

}