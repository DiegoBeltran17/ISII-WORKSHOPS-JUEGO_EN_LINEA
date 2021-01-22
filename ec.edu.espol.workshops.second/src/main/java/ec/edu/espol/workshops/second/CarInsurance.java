package ec.edu.espol.workshops.second;

public class CarInsurance {
	
	private int basePremium;
	
	public CarInsurance()
	{
		basePremium = 500;
	}
	
	
	public int checkCredentials(Customer customer)
	{
		//customer attributes
		int customerAge = customer.getAge();
		char customerSex = customer.getSex();
		boolean customerIsMarried = customer.getIsMarried();
		
		//business policies 
		boolean customerValidDriverLic = customer.getHasValidDriverLicense();
		boolean isNotYoungEnough = customerAge > 80;
		boolean isYoungSingleMale = (customerSex == 'M') && !customerIsMarried && (customerAge < 25);	
		boolean isYoungMaleNewReq = (customerSex == 'M') && (customerAge > 25 && customerAge < 45);
		boolean isFemaleOrMarried = (customerSex == 'F') || customerIsMarried;
		boolean isYoungEnough = (customerAge > 45) && (customerAge < 65);
		
		
		//Logic
		if(isNotYoungEnough || !customerValidDriverLic)
			return -1;
		if(isFemaleOrMarried)
		{
			basePremium -= 200;
		}else if(isYoungSingleMale)
		{
			basePremium += 1500;
		}else if(isYoungMaleNewReq)
		{
			basePremium -= 100;
		}
		else if(isYoungEnough)
		{
			basePremium -= 100;
		}else {
			return -1;
		}	
		return 1;
	}
	
}
