class Plateform {
	String str = null;
	int foundYear = 0;

	Plateform(String str,int foundYear){
		this.str = str;
		this.foundYear = foundYear;
	}

	public String toString(){
		return "{"+str+":"+foundYear+"}";
	}



}

class SortByName implements java.util.Comparator{
	public int compare(Object obj1, Object obj2){
		return (((Plateform)obj1).str.compareTo(((Plateform)obj2).str));
	}
}
class Demo{
	public static void main(String[] args){
		java.util.TreeMap tm= new java.util.TreeMap( new SortByName());
			tm.put(new Plateform("Youtube",2005),"Google");
			tm.put(new Plateform("Instagram",2010),"Meta");
			tm.put(new Plateform("Facebook",2004),"Meta");
			tm.put(new Plateform("ChatGPT",2022),"OpenAI");
			//cannot use COllection.sort() with TreeMap as it is not part of List but Map
			System.out.println(tm);
	}
}
