interface Car{
	public String carBook(String source, String Destination);
}

class Demo{
	public static void main(String[] args){
		Car car =(String source,String Destination)->{
			System.out.println("Car goes from "+source+" "+Destination);
			return "200";
		};

		System.out.println(car.carBook("Pune","Mumbai"));
	}
}
