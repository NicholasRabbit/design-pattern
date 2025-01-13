public class Tesla extends Saloon{

	public Tesla(){
	
	}
	public Tesla(String brand){
		this.brand = brand;
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