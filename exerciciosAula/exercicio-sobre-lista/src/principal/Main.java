package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	double salary;
	String name;
	Scanner sc = new Scanner(System.in);
	System.out.printf("How many employees will be registered? ");
	int n = sc.nextInt();
	sc.nextLine();
	List <Employee> listaEmpregados = new ArrayList<>();
	for(int i = 0; i<n; i++) {
		System.out.printf("Employee #%d:%n", i + 1);
		System.out.print("Id: ");
		int id = sc.nextInt();
		while (hasId(listaEmpregados, id)) {
			System.out.print("Id already taken. Try again: ");
			id = sc.nextInt();
		}
		
		sc.nextLine();
		System.out.printf("Name: ");
		name = sc.nextLine();
		System.out.printf("Salary: ");
		salary = sc.nextDouble();
		
		listaEmpregados.add(new Employee(id, name, salary));
	}
	
	
	System.out.print("Enter the employee id that will have salary increase: ");
	int id = sc.nextInt();
	
	Employee emp = listaEmpregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	if(emp == null) {
	System.out.println("This id does not exist!");
	}
	
	else {
	System.out.printf("Enter the percentage: ");
	Double percentage = sc.nextDouble();
	emp.increaseSalary(percentage);
	}
	
	System.out.printf("List of employees: %n");
	for(Employee empl : listaEmpregados) {
		System.out.println(empl);
	}
	
	sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
	

