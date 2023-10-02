class Parent{
	void fun(int x){}
}

class Child extends Parent{
	void fun(){}
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
		pObj.fun();
	}
}
