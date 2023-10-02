 class Employee{
	int empId = 10;
	String empName = "MK";
   
	static int y = 20;
	void display(){
		System.out.println(empId);
		System.out.println(empName);
		System.out.println("y="+y);
		return;
	}
}

class Demo{
	public static void main(String[] args){
		Employee eObj1 = new Employee();
		Employee eObj2 = new Employee();
		eObj2.empId =11;
		eObj2.empName ="Shyam";
		eObj1.display();
		eObj2.y =30;
		eObj2.display();

		System.out.println("id1=="+eObj1.empId);
		System.out.println("name=="+eObj1.empName);
		System.out.println("y=="+eObj1.y);
		System.out.println("y=="+Employee.y);
		System.out.println("id=="+eObj2.empId);
		System.out.println("name=="+eObj2.empName);
	}
}
