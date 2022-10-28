package com.dp.builder.improve;

public class BuilderTest {

	public static void main(String[] args) {
		
		AbstractHouseBuilder  villa = new VillaHouseBuilder();
		HouseBuildCommander hbc = new HouseBuildCommander(villa);
		hbc.contructHouse();
		
	}

}
