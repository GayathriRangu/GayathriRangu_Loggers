package com.gayathri.houseConstructionCost;



public class HouseFactory {
	
public HouseConstructionCost getInstance(String materialStandard)
{
	
	if(materialStandard.equals("standard"))
		return new StandardHouse();
	else if(materialStandard.equals("above standard"))
		return new AboveStandardHouse();
	else if(materialStandard.equals("high standard"))
	     return new HighStandardHouse();
	else if(materialStandard.equals("high standard with automated"))
	      return new HighStandardAutomatedHouse();
	else return null;
	

}
	
}
