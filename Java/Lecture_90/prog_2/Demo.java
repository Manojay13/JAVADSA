class Plateform implements Comparable{
	String str = null;
	int foundYear = 0;

	Plateform(String str,int foundYear){
		this.str = str;
		this.foundYear = foundYear;
	}

	public String toString(){
		return "{"+str+":"+foundYear+"}";
	}

	public int compareTo(Object obj){
		return this.foundYear-((Plateform)obj).foundYear;
	}


}
class Demo{
	public static void main(String[] args){
		java.util.TreeMap tm= new java.util.TreeMap();
			tm.put(new Plateform("Youtube",2005),"Google");
			tm.put(new Plateform("Instagram",2010),"Meta");
			tm.put(new Plateform("Facebook",2004),"Meta");
			tm.put(new Plateform("ChatGPT",2022),"OpenAI");

			System.out.println(tm);
	}
}
