package ec.edu.espol.workshops.second;

public class Customer {
	private int age;
	private char sex;
	private boolean isMarried;
	private boolean hasValidDriverLicense;
	public Customer(int age, char sex, boolean isMarried, boolean hasValidDriverLicense)
	{
		this.age = age;
		this.sex = sex;
		this.isMarried = isMarried;
		this.hasValidDriverLicense = hasValidDriverLicense;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public char getSex()
	{
		return sex;
	}
	
	public void setSex(char newSex)
	{
		sex = newSex;
	}
	
	public boolean getIsMarried()
	{
		return isMarried;
	}
	
	public void setIsMarried(boolean married)
	{
		isMarried = married;
	}
	
	public boolean getHasValidDriverLicense()
	{
		return hasValidDriverLicense;
	}
}
