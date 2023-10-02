class Employee{
	int empId = 0;
	String name =null;

	Employee(int empId,String name){
		this.empId = empId;
		this.name = name;
	}

	public String toString(){
		return (empId+":"+name);
	}
}


class SortByName implements java.util.Comparator{
	public int compare(Object obj1,Object obj2){
		return (((Employee)obj1).name.compareTo(((Employee)obj2).name));
	}
}
class Demo{
	public static void main(String[] args){
		java.util.ArrayList  al = new java.util.ArrayList();
		al.add(new Employee(25,"MK"));
		al.add(new Employee(15,"SK"));
		al.add(new Employee(22,"PK"));

		System.out.println(al);

		java.util.Collections.sort(al,new SortByName());
		System.out.println(al);
	}
}
