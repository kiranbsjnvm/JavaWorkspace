package com.factorymethod;

public class GetPlanFactory {

	public Plan getPlan(String planType)
	{
		
		if(planType == null)
		{  
            return null;  
        } 
		
		switch (planType) {
		case "DOMESTICPLAN":
			 return new DomesticPlan();
		case "COMMERCIALPLAN":
			 return new CommercialPlan();
		case "INSTITUTIONALPLAN":
			 return new InstitutionalPlan();
		default:
			break;
		}
		
		return null;
	}
}
