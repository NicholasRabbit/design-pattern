public abstract class Saloon implements Vehicle {

	public String brand;

	public Saloon(){
	
	}
	public Saloon(String brand){
		this.brand = brand; 
	}

	
	public abstract void start();
	public abstract void transmit();
	public abstract void accelerate();


}