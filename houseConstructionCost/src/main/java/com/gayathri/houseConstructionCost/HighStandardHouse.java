package com.gayathri.houseConstructionCost;

public class HighStandardHouse extends HouseConstructionCost {
	public String materialStandard="high standard";
	public long 	totalCostOfHouse=0;
	public long costPerSquareFeet=1800;
	public long calculatingTotalCost(long areaOfHouse, String materialStandardRequired) {

			
return	totalCostOfHouse=costPerSquareFeet*areaOfHouse;

	}

}
