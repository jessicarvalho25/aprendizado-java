package entities;

public class Employee {

	public Integer id;
	public String name;
	private Double salary;
	
	
	public  void increaseSalary(double percentage) {
		salary += salary * (percentage/100.0);
	}


	public Double getSalary() {
		return salary;
	}

	public Integer getId () {
		return id;
	}
	
	public Employee (Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString () {
		return id + ", "
				+ name + ", "
				+ String.format("%.2f", salary);
	}

	
}
