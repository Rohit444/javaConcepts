import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		List<Integer> list = new ArrayList<>();
//        for(int i=0; i<=10;i++) {
//        	int numb = random.nextInt(20);
//        	list.add(numb);
//        }
		
		List<Employee> empList = populateEmployeeObj();
        
        Collections.sort(empList, new MyComparator());;
        
       for(Employee emp : empList) {
    	  System.out.println(emp);
       }
		
	}
	
	public static List<Employee> populateEmployeeObj() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee("Rohit", "Development");
		Employee emp2 = new Employee("Swati", "tester");
		Employee emp3 = new Employee("Suman", "Devops");
		Employee emp4 = new Employee("Mohit", "IT");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		return empList;
		
	}

}

class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
	
}
