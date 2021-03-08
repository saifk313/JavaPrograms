package programs;

public class Employee {
	
	int empno;
	
	Employee(int no){
		empno=no;
	}

	public static void main(String args[]) {
		Employee emp = new Employee(1);
		System.out.println(emp.empno);
	}
}
