package company;
import company.Employe;
import java.util.*;

public class ContractEmploye extends Employe
{
    int workingHours;
	
	public ContractEmploye(String name, int age, String gender, String place, int paymentPerHour, int workingHours)
	{
		super(name,age,gender,place,paymentPerHour);
		this.workingHours=workingHours;
	}
	
	public int calculateSalary()
	{
		return paymentPerHour*workingHours;
	}
	
	public void printDetails()
	{
		System.out.println("Type of the Employee: Contract Based Employee");
		System.out.println("Name of the Employee: "+name);
		System.out.println("Age of the Employee: "+age);
		System.out.println("Gender of the Employee: "+gender);
		System.out.println("Place of the Employee: "+place);
		System.out.println("Payment per hour: "+paymentPerHour);
		System.out.println("Salary: "+calculateSalary());
	}
		
}
