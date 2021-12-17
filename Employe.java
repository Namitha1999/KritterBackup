package company;
import java.util.*;

public abstract class Employe
{
	static public String companyName="Kritter";
	static public String companyLocation="Bangalore";
	static public int numberOfEmployees=50;
	
    String name;
    int age;
    String gender;
    String place;
	int paymentPerHour;
	
	public Employe(String name, int age, String gender, String place, int paymentPerHour)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.place=place;
		this.paymentPerHour=paymentPerHour;
	}
	
	public abstract int calculateSalary();
	
	public static void changeCompanyDetails(String newName, String newLocation, int newStrength)
	{
		companyName=newName;
		companyLocation=newLocation;
		numberOfEmployees=newStrength;
	}
	
}
