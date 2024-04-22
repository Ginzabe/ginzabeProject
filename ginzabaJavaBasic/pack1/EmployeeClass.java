package pack1;

public class EmployeeClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(200);
		e1.setEmpname("Abdullah");
		e1.setEmpsalary(300.50);
		
		Employee e2 = new Employee();
		e2.setEmpid(200);
		e2.setEmpname("Abdullah");
		e2.setEmpsalary(300.50);
		
		
		System.out.println(e1.getEmpid()+" "+e1.getEmpname()+" " +e1.getEmpsalary());
		
		System.out.println(e2.getEmpid()+" "+e2.getEmpname()+" " +e2.getEmpsalary());
		
		
		
	}

}
