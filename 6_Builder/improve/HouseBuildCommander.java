

public class HouseBuildCommander {
	
	AbstractHouseBuilder ahb;
	
	public HouseBuildCommander() {
		
	}
	public HouseBuildCommander(AbstractHouseBuilder ahb) {
		this.ahb = ahb;
	}
	
	//实际在在这里规定好建造的流程，并执行
	public House contructHouse() {
		ahb.baseBuild();
		ahb.wallBuild();
		ahb.roofHeight();
		//返回要建造的房子
		return ahb.build();
	}

}
