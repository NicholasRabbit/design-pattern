
public class VillaHouseBuilder extends AbstractHouseBuilder{

	@Override
	public void baseBuild() {
       //this.house.setBaseThick(300);  
       /*System.out.println("Villa house base:" + this.house.getBaseThick());*/
		System.out.println("Villa house base:");
	}

	@Override
	public void wallBuild() {
		System.out.println("Villa house wall:");
	}

	@Override
	public void roofHeight() {
		System.out.println("Villa house roof:");	
	}
	
	public House build() {
		return house;
	}
}
