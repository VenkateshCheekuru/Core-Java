
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 class Employee {

	private String name;
	private String account;
	private Integer salary;

	public Employee(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	@Override
	public String toString() {

		return "name: "+ this.name +" | account: "+ this.account +" | salary: "+this.salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}





 class LambdaExp {

	public static void main(String a[]) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nataraja G", "Accounts", 8000));
		empList.add(new Employee("Nagesh Y", "Admin", 15000));
		empList.add(new Employee("Vasu V", "Security", 2500));
		empList.add(new Employee("Amar", "Entertinment", 8500));

		
		LambdaExp.sortInLambdaWay(empList);
	}



	public static void sortInLambdaWay(List<Employee> empList) {

		Collections.sort(empList, (Employee e1, Employee e2) -> e2.getSalary().compareTo(e1.getSalary()));

		System.out.println("\n\n<--- Sorted list with Lambda - DESC order --->");
		empList.forEach(emp->System.out.println(emp.toString()));

		Collections.sort(empList, (Employee e1, Employee e2) -> e1.getSalary().compareTo(e2.getSalary()));

		System.out.println("\n\n<--- Sorted list with Lambda - ASC order --->");
		empList.forEach(emp->System.out.println(emp.toString()));
	}
}