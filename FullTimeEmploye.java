package company;
import company.Employe;
import java.util.*;

public class FullTimeEmploye extends Employe
{
    public FullTimeEmploye(String name, int age, String gender, String place, int paymentPerHour)
	{
		super(name,age,gender,place,paymentPerHour);
	}
	
	public int calculateSalary()
	{
		return paymentPerHour*8;
	}
	
	public void printDetails()
	{
		System.out.println("Type of the Employee: Full Time Employee");
		System.out.println("Name of the Employee: "+name);
		System.out.println("Age of the Employee: "+age);
		System.out.println("Gender of the Employee: "+gender);
		System.out.println("Place of the Employee: "+place);
		System.out.println("Payment per hour: "+paymentPerHour);
		System.out.println("Salary: "+calculateSalary());
	}
}
