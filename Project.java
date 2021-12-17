import company.ContractEmploye;
import company.FullTimeEmploye;
import company.Employe;
import java.util.*;

class Project
{
    public static void main(String[] args) 
	{
		ArrayList<ContractEmploye> ContractEmployeList = new ArrayList<ContractEmploye>();
		ArrayList<FullTimeEmploye> FullTimeEmployeList = new ArrayList<FullTimeEmploye>();
        Scanner sc=new Scanner(System.in);
		
		char cont='y';
		
		while (cont=='y')
		{
			System.out.println("1. Add Details of Employees\n2. View Details of Employees\n3. View Company Details\n4. Edit Company Details");
			System.out.print("Select option: ");
			char op=sc.next().charAt(0);
			if (op=='1')
			{
				System.out.println("1. Contract Employee\n2. Full Time Employee");
				System.out.print("Select the type of Employee: ");
				char option=sc.next().charAt(0);
				System.out.print("Enter the name: ");
				String name=sc.nextLine();
				boolean flag=false;
				int age=0;
				while(!flag)
				{
					try{
						System.out.print("Enter the age: ");
						age=sc.nextInt();
						flag=true;
					
					}
					catch(NumberFormatException e){
						System.out.println("Invalid Entry");
						
					}
						
				}
				System.out.print("Enter the gender: ");
				String gender=sc.nextLine();
				System.out.print("Enter the place: ");
				String place=sc.nextLine();
				boolean flag1=false;
				int paymentPerHour=0;
				while(!flag1)
				{
					try{
						System.out.print("Enter the payment per hour: ");
						paymentPerHour=sc.nextInt();
						flag1=true;
					
					}
					catch(NumberFormatException e){
						System.out.println("Invalid Entry");
						
					}
						
				}
				
				if (option=='1')
				{
					String type="Contract Employee";
					System.out.print("Enter the Number of Hours: ");
					int workingHours=sc.nextInt();
					ContractEmploye emp = new ContractEmploye(name,age,gender,place,paymentPerHour,workingHours);
					ContractEmployeList.add(emp);
				}
				
				else if (option=='2')
				{
					String type="Full Time Employee";
					FullTimeEmploye emp = new FullTimeEmploye(name,age,gender,place,paymentPerHour);
					FullTimeEmployeList.add(emp);
				}
				else
					System.out.println("Invalid Entry");
			}
			
			else if (op=='2')
			{
				System.out.println("1. Contract Employee\n2. Full Time Employee");
				System.out.println("Select the type of Employee: ");
				char option1=sc.next().charAt(0);
				if (option1=='1')
				{
					for (ContractEmploye i: ContractEmployeList)
						i.printDetails();
				}
				else if (option1=='2')
				{
					for (FullTimeEmploye i: FullTimeEmployeList)
						i.printDetails();
				}
				else
					System.out.println("Invalid Entry");
			}
			else if (op==3)
			{
				System.out.println("Company Name: "+Employe.companyName);
				System.out.println("Company Location: "+Employe.companyLocation);
				System.out.println("Number of Employees: "+Employe.numberOfEmployees);
			}
			else if (op==4)
			{
				System.out.print("Enter the new name: ");
				String newName=sc.nextLine();
				System.out.print("Enter the new location: ");
				String newLocation=sc.nextLine();
				System.out.print("Enter the new Strength: ");
				int newStrength=sc.nextInt();
				Employe.changeCompanyDetails(newName,newLocation,newStrength);
			}
			else
				System.out.println("Invalid Entry");
			System.out.print("Do you want to continue?(y/n): ");
			cont=sc.next().charAt(0);
		}
		
		
	}
}