package sorting.custom.comparators.employee;

import java.util.Comparator;

public class EmployeeComparatorBasedOnLowestSalary implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		
		// e1 e2
		// e1 (John, 10000), e2 (Mary, 5000)
		
		// Outcome
		// e2 (Mary, 5000), e1 (John, 10000)
		
		// Ascending order Logic
		if (e1.salary < e2.salary) {
			return -1;
		} else if (e1.salary > e2.salary) {
			return +1;
		} else {			
			return 0;
		}					
	}

	
}
