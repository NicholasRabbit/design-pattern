
//国产车订购的类，工厂类
public class BuyDomesticCar extends BuyCarAbstract {

 
    public Vehicle createCar(String carMake){
		
		Vehicle car = null;
		
		if("corrolla".equals(carMake)){
			car = new Corrolla();	
		}else if("prado".equals(carMake)){
			car = new Prado();
		}

		return car;
    }

}