

/*
*建造者模式的好处
*如果需要建造新的类型的房子，只需新建一个对应的Builder类继承AbstractHouseBuilder.java即可
*实现了建造者，操作者，房子三者的接口
*符合OCP原则，即对修改关闭，对扩展开放，增加一个Builder类即为扩展。
*/

public class BuilderTest {

	public static void main(String[] args) {
		
		AbstractHouseBuilder  villa = new VillaHouseBuilder();
		HouseBuildCommander hbc = new HouseBuildCommander(villa);
		hbc.contructHouse();
	
		AbstractHouseBuilder  skyscraper = new Skyscraper();
		HouseBuildCommander hbc2 = new HouseBuildCommander(skyscraper);
		hbc2.contructHouse();

		
	}

}
