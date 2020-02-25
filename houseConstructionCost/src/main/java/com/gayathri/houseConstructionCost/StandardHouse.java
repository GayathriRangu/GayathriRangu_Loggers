package com.gayathri.houseConstructionCost;

public class StandardHouse extends HouseConstructionCost {
	
	public  String materialStandard="standard";
	public long totalCostOfHouse=0;
	public long costPerSquareFeet=1200;
	public long calculatingTotalCost(long areaOfHouse, String materialStandardRequired) {
return totalCostOfHouse=costPerSquareFeet*areaOfHouse;	
	}
	}

