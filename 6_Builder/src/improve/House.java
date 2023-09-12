

public class House {
	
	private int baseThick; //地基厚度
	private int wallThick; //墙体厚度
	private int roofHeight; //房顶高度
	
	public int getBaseThick() {
		return baseThick;
	}
	public void setBaseThick(int baseThick) {
		this.baseThick = baseThick;
	}
	public int getWallThick() {
		return wallThick;
	}
	public void setWallThick(int wallThick) {
		this.wallThick = wallThick;
	}
	public int getRoofHeight() {
		return roofHeight;
	}
	public void setRoofHeight(int roofHeight) {
		this.roofHeight = roofHeight;
	}
	
	public String toString(){
		return "{" + "thickness:" + this.baseThick + "wall:" + wallThick + "roof:" + roofHeight + "}";
	}
	

}
