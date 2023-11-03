import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ipd.Employee;

public class OperationsOnEmployeeObject {

	public static void main(String args[]) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "ravi", 150000L, "male", "computers"));
		empList.add(new Employee(2, "suresh", 250000L, "male", "chemistry"));
		empList.add(new Employee(3, "sandhya", 50000L, "female", "chemistry"));
		empList.add(new Employee(4, "deepu", 450000L, "female", "computers"));

		// sort employees based on salaries in descending order
		empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).forEach(emp -> {

			System.out.println("-------------------------------------");
			System.out.println("" + emp.getEid() + "\n");
			System.out.println("" + emp.getEname() + "\n");
			System.out.println("" + emp.getEsalary() + "\n");
			System.out.println("" + emp.getGender() + "\n");
			System.out.println("" + emp.getDept() + "\n");
			System.out.println("-------------------------------------");
		}

		);

		// fetch top 3 employee details
		empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).limit(3).forEach(emp -> {
			System.out.println("-------------------------------------");
			System.out.println("Top 3 salaries" + emp.getEsalary());
			System.out.println("-------------------------------------");
		});

		// max salary of the employee
		Employee emp = empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).findFirst().get();
		System.out.println("Max salary " + emp.getEsalary());
		
		// max salary of the employee
		System.out.println("\nfinding max salary of employee");
		Optional<Employee> empMax = empList.stream().max(Comparator.comparing(Employee::getEsalary));
		System.out.println(empMax.get().getEsalary());

		// Second max salary of the employee
		Employee secondEmp = empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println("Seconcd Max salary " + secondEmp.getEsalary());

		// fetch all employees having salary less than 3rd highest salary
		empList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed()).skip(3).forEach(emp1 -> {
			System.out.println("-------------------------------------");
			System.out.println("" + emp1.getEid() + "\n");
			System.out.println("" + emp1.getEname() + "\n");
			System.out.println("" + emp1.getEsalary() + "\n");
			System.out.println("" + emp1.getGender() + "\n");
			System.out.println("" + emp1.getDept() + "\n");
			System.out.println("-------------------------------------");
		});
		
		System.out.println("\nEmployee Count in Each Department");
		Map<String, Long> count =empList.stream().collect(Collectors.groupingBy(Employee :: getDept, Collectors.counting()));
		System.out.println(count);
		
		System.out.println("\nEmployee Max Salary of Each Department");
		Map<String, Optional<Employee>> cou =empList.stream().collect(Collectors.groupingBy(Employee :: getDept, Collectors.maxBy(Comparator.comparing(Employee::getEsalary))));
		cou.entrySet().forEach(entry -> System.out.println("Dept::"+ entry.getKey() + " , max emp salary::" + entry.getValue().get().getEsalary()));
		

	}

}
