
//建造房子的抽象类，这里规定好建造房子的方法
public abstract class AbstractBuilding {

	public abstract void baseBuild();
	public abstract void wallBuild();
	public abstract void roofBuild();
	
	//这个方法里定好建造顺序
	public void build(){
		baseBuild();
		wallBuild();
		roofBuild();
	}
}