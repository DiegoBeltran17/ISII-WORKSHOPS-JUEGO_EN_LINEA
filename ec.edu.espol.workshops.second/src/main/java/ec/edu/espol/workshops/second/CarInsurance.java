package ec.edu.espol.workshops.second;

public class CarInsurance {
	
	private int basePremium;
	
	public CarInsurance()
	{
		basePremium = 500;
	}
	
	
	public int checkCredentials(Customer customer)
	{
		System.out.println(basePremium);
		//customer attributes
		int customerAge = customer.getAge();
		char customerSex = customer.getSex();
		boolean customerIsMarried = customer.getIsMarried();
		System.out.println(customerSex);
		char m = 'M';
		char f = 'F';
		//business policies 
		boolean customerValidDriverLic = customer.getHasValidDriverLicense();
		boolean isNotYoungEnough = customerAge > 80;
		boolean isYoungSingleMale = (customerSex == m) && !customerIsMarried && (customerAge < 25);	
		boolean isYoungMaleNewReq = (customerSex == m) && (customerAge > 25 && customerAge < 45);
		boolean isFemaleOrMarried = (customerSex == f) || customerIsMarried;
		boolean isYoungEnough = (customerAge > 45) && (customerAge < 65);
		
		
		//Logic
		if(isNotYoungEnough || !customerValidDriverLic)
			return -1;
		if(isFemaleOrMarried)
		{
			basePremium -= 200;
			System.out.println("isFemaleOrMa");
		} if(isYoungSingleMale)
		{
			basePremium += 1500;
			System.out.println("IsyoungSingle");
		} if(isYoungMaleNewReq)
		{
			basePremium -= 100;
			System.out.println("isYoungMaleNew");
		}
		 if(isYoungEnough)
		{
			basePremium -= 100;
			System.out.println("isYoungEnogu");
		}
		return basePremium;
	}
	
}
