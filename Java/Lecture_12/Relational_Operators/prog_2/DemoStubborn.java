class DemoStubburn{
	
	public static void main(String[] args){
		int x =10;
		int y = 10;
		if(!new Object() {
        public boolean foo() {
            System.out.print("Hello ");
            return true;
        }
    }.foo()){
        System.out.println("Hello");
    }else{
        System.out.println("World");
    }
	}
}
