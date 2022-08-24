
/*
一，看一个新的需求，来说明简单工厂模式的不足
	如果客户要买国外的这种corrolla车型，怎么做？
	按照上例的简单工厂模式，需要再新建一个国外工厂类，来专门生产国外的车，
	这样以来，后期项目规模增大的话会不适用；
二，解决上面的问题可使用工厂方法模式，即再BuyCarAbstract.java创建一个抽象的制造汽车的方法
	然后由具体的实现类来实例化不同的车，即把实例化的操作在子类完成；
*/

//注意，编译时执行 javac -encoding utf-8 FactoryStoreTest.java即可，不用*.java
public class FactoryStoreTest {

	public static void main(String[] args){
		
		String location = "foreign";
		
		if("foreign".equals(location)){
			//买进口车型
			System.out.println("买进口车型");
			BuyCarAbstract buyCar = new BuyForeignCar();
		}else if("domestic".equals(location)){
			//买国产的车型
			System.out.println("买国产车型");
			BuyCarAbstract buyCar = new BuyDomesticCar();
		}
		
		
	}
}