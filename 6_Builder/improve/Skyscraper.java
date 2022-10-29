public class Skyscraper extends AbstractHouseBuilder{


    @Override
	public void baseBuild() {
		System.out.println("Skyscraper house base:");
	}

	@Override
	public void wallBuild() {
		System.out.println("Skyscraper house wall:");
	}

	@Override
	public void roofHeight() {
		System.out.println("Skyscraper house roof:");	
	}
	
	public House build() {
		return house;
	}
    
}
