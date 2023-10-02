class Core2Web{
	int numCourses = 8;
	String favCourse = "CPP";

	void disp(){
		System.out.println(numCourses);
		System.out.println(favCourse);
	}
}

class Student{
	public static void main(String[] args){
		Core2Web cb = new Core2Web();
		cb.disp();
	}
}
