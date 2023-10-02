class ITCompany{
	String companyName = null;
	int employeeCount =0;
	ITCompany(String companyName,int employeeCount){
		this.companyName = companyName;
		this.employeeCount = employeeCount;
	}
}

class Demo{
	public static void main(String[] args){
		java.util.ArrayList  obj = new java.util.ArrayList();
		obj.add(10.5);
		obj.add(10);
		obj.add("Core2Web");
		obj.add(new ITCompany("Biencaps",20));//object will be not print as tostring method is not there .
						      //It is not sutable to run for loop on this

		System.out.println(obj);
	}
}
