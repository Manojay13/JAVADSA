class Parent{
	int fun(){
		System.out.println("Parent fun");
		return 10;
	}
}
class Child extends Parent{
	char fun(){
		System.out.println("Child fun");
		return 'A';
	}
}
