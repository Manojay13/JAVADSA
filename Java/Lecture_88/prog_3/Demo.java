class Employee{
	String employeeName = null;
	float  salary = 0.0f;

	Employee (String employeeName, float salary){
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public String toString(){
		return("{"+employeeName+":"+salary+"}");
	}


}

class SortByName implements java.util.Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return obj1.employeeName.compareTo(obj2.employeeName);
	}
}

class SortBySalary implements java.util.Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
		return (int)(obj1.salary-obj2.salary);
	}
}

class Demo{
	public static void main(String[] args){
		java.util.ArrayList<Employee> al = new java.util.ArrayList<Employee>();
		al.add(new Employee("MK",200000.00f));
		al.add(new Employee("SK",250000.00f));
		al.add(new Employee("LK",150000.00f));
		al.add(new Employee("IK",175000.00f));

		java.util.Collections.sort(al,new SortByName());//searches compare method
		System.out.println(al);
		java.util.Collections.sort(al,new SortBySalary());
		System.out.println(al);
	}
}
