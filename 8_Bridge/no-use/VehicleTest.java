public class VehicleTest {

	public static void main(String[] args){
		
		Vehicle  benz = new Benz("Benz");
		benz.start();
		benz.transmit();
		benz.accelerate();

		Vehicle tesla = new Tesla("Tesla");
		tesla.start();
		tesla.transmit();
		tesla.accelerate();
	}
}