class Movies implements Comparable{
	String movieName = null;
	float totalCollection = 0.0f;

	Movies(String movieName,float totalCollection){
		this.movieName = movieName;
		this.totalCollection = totalCollection;
	}
	/*public int compareTo(Object obj){
		return movieName.compareTo(((Movies)obj).movieName);
	}*/
	//Decending
	public int compareTo(Object obj){
		return (-1)*(movieName.compareTo(((Movies)obj).movieName));
	}

	public String toString(){
		return movieName;
	}
}

class TreeSetDemo{
	public static void main(String[] args){
		java.util.TreeSet ts = new java.util.TreeSet();
		ts.add(new Movies("Gadar 2",120.00f));
		ts.add(new Movies("OMG 2",150.00f));
		ts.add(new Movies("Jailor",250.00f)); 

		System.out.println(ts);
	}
}
