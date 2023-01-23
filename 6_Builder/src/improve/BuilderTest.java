

/*
* 建造模式是什么？
* 一个对象的构建步骤相同，但是属性参数不同，需要创建不同的参数值的对象，注重和针对是内部复杂参数值的变化。
* 即创建对象的步骤或所需参数比较复杂，但是还要暴露部分参数设置给用户。
* 参照范例代码HttpClient中建造RequestConfig的范例。
* 
* 1,建造者模式的好处
* 如果需要建造新的类型的房子，只需新建一个对应的Builder类继承AbstractHouseBuilder.java即可
* 实现了建造者，建造步骤(操作者)，房子三者的解耦。
* 符合OCP原则，即对修改关闭，对扩展开放，增加一个Builder类即为扩展。
*
* 2,本范例是传统的建造者模式，有一种新的改进的建造者模式，把command的角色交给用户(程序员)决定
* 参照JeeSite范例。其他范例：https://blog.csdn.net/ShuSheng0007/article/details/86619675
*/

public class BuilderTest {

	public static void main(String[] args) {
		
		AbstractHouseBuilder  villaBuilder = new VillaHouseBuilder();
		HouseBuildCommander hbc = new HouseBuildCommander(villaBuilder);
		hbc.contructHouse();
	
		AbstractHouseBuilder  skyBuilder = new SkyscraperBuilder();
		HouseBuildCommander hbc2 = new HouseBuildCommander(skyBuilder);
		hbc2.contructHouse();

		
	}

}
