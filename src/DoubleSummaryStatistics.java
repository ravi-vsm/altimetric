import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ipd.Employee;

public class DoubleSummaryStatistics {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "ravi", 150000L, "male", "computers"));
		empList.add(new Employee(2, "suresh", 250000L, "male", "chemistry"));
		empList.add(new Employee(3, "sandhya", 50000L, "female", "chemistry"));
		empList.add(new Employee(4, "deepu", 450000L, "female", "computers"));
		
		java.util.DoubleSummaryStatistics dou = empList.stream().collect(Collectors.summarizingDouble(Employee :: getEsalary));
		System.out.println("Average Salary of Emp "+ dou.getAverage());
		System.out.println("Sum of salaries of Emp " + dou.getSum());

	}

}
