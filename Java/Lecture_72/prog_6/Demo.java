class Demo{
	int x = 10;

	void marry(){
		System.out.println("Deepika");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new Demo(){
			//anonymous inner class
			void marry(){
				System.out.println("Kriti");
				System.out.println(this);
			}
		};
		obj.marry();
		Demo obj1 = new Demo(){
			//anonymous inner class
			void marry(){
				System.out.println("Priti");
				System.out.println(this);
				fun();
			}
			void fun(){}
		};
		Demo obj2 = new Demo(){
			//anonymous inner class
			void marry(){
				System.out.println("Priti");
				System.out.println(this);
				fun();
			}
			Demo  fun(){
				return(new Demo());
			}
		}.fun();

		obj2.marry();
	}
}
