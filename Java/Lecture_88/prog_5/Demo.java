class Movies{
	String movieName = null;
	Double collection = 0.0;
	Float imdbRating = 0.0f;

	Movies(String movieName,Double collection,Float imdbRating){
		this.movieName = movieName;
		this.collection = collection;
		this.imdbRating = imdbRating;
	}

	public String toString(){
		return ("{"+movieName+":"+collection+":"+imdbRating+"}");
	}
}

class SortByName implements java.util.Comparator{
	public int compare(Object  obj1,Object obj2){
		return (((Movies)obj1).movieName.compareTo(((Movies)obj2).movieName));
	}

	
}

class SortByCollection implements java.util.Comparator{
	public int compare(Object obj1, Object obj2){
		return (int)((-1)*((Movies)obj1).collection -((Movies)obj2).collection);
	}
}

class SortByIMDbRating implements java.util.Comparator{

	public int compare(Object obj1, Object obj2){
		return (int)(((Movies)obj1).imdbRating -((Movies)obj2).imdbRating);
	}
}

class Demo{

	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();
		al.add(new Movies("Gadar 2",2.6,6.7f));
		al.add(new Movies("OMG 2",3.2,7.4f));
		al.add(new Movies("Jailor",5.2,7.9f));

		java.util.Collections.sort(al,new SortByName());
		System.out.println(al);


		java.util.Collections.sort(al,new SortByCollection());
		System.out.println(al);
	
		
		java.util.Collections.sort(al,new SortByIMDbRating());
		System.out.println(al);
	}
}
