class Employee{
	String Emp_name;
	String Emp_id;
	String Dept_name;
	int Salary;
	Employee(String a,String b,String c,int d){
		Emp_name=a;
		Emp_id=b;
		Dept_name=c;
		Salary=d;
	}
	Employee(Employee emp){
		Emp_name=emp.Emp_name;
		Emp_id=emp.Emp_id;
		Dept_name=emp.Dept_name;
		Salary=emp.Salary;
	}
	void show() {
		System.out.println(Emp_name+" "+Emp_id+" "+Dept_name+" "+Salary);
	}
}
public class FirstCode{

	public static void main(String args[]) {
		//This keyword is a reference variable that refers to the current object
		Employee emp[] = new Employee[3];
		emp[0] = new Employee("Myra","123","Civil",1234);
		emp[1] = new Employee(emp[0]);
		emp[0].show();
		emp[1].show();
		
		  
	}
}
