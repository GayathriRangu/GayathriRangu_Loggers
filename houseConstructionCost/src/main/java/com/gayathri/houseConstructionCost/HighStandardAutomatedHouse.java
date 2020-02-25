package com.gayathri.houseConstructionCost;

public class HighStandardAutomatedHouse extends HouseConstructionCost {
	
	public String materialStandard="high standard automated";
	public long	totalCostOfHouse=0;
	public long costPerSquareFeet=2500;
	public long calculatingTotalCost(long areaOfHouse, String materialStandardRequired) {
			
	 return totalCostOfHouse=costPerSquareFeet*areaOfHouse;

	}

}
