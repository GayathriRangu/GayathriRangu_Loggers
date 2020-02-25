package com.gayathri.houseConstructionCost;

public class AboveStandardHouse extends HouseConstructionCost {

	public String materialStandard="above standard";
	public long	totalCostOfHouse;
	public long costPerSquareFeet=1500;
	public long calculatingTotalCost(long areaOfHouse, String materialStandardRequired) {
		return totalCostOfHouse=costPerSquareFeet*areaOfHouse;

	}

}
