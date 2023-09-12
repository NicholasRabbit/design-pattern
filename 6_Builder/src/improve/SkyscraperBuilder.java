public class SkyscraperBuilder extends AbstractHouseBuilder{


    @Override
	public void baseBuild() {
		this.house.setBaseThick(200);
		System.out.println("Skyscraper house base:");
	}

	@Override
	public void wallBuild() {
		this.house.setWallThick(100);
		System.out.println("Skyscraper house wall:");
	}

	@Override
	public void roofHeight() {
		this.house.setRoofHeight(500);
		System.out.println("Skyscraper house roof:");	
	}
	
	public House build() {
		return house;
	}
    
}
