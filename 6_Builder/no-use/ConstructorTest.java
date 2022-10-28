
/**
*建造商，在这里进行盖房子操作
*普通写法的弊端：
*建造过程是写在房子里的，和房子耦合性太强，没有中间层，
*新造房子就得重新写个类，再写一遍建造流程。
*/
public class ConstructorTest {
	
	public static void main(String[] args){
		//建造普通房子
		AbstractBuilding  villa = new VillaHouse();
		villa.build();
		//建造摩天大楼
		AbstractBuilding  skyscraper = new Skyscraper();
		skyscraper.build();
	}

}
