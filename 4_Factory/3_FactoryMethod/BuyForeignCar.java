
public class BuyForeignCar extends BuyCar {

    public Vehicle createCar(String carMake){
		Vehicle car = null;
		if("corrolla import".equals(carMake)){
			return new CorrollaImport();
		}else if("prado import".equals(carMake)){
			return new PradoImport();
		}
		return car;

    }

}