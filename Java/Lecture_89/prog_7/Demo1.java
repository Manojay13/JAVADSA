class Demo1{
	public static void main(String[] args){
		java.util.HashMap hm = new java.util.HashMap();

		hm.put(new Integer(10),100000);
		hm.put(new Integer(10),200000);
		hm.put(new Integer(10),300000);

		System.out.println(hm);
		java.util.IdentityHashMap hm1 = new java.util.IdentityHashMap();

		hm1.put(new Integer(10),100000);
		hm1.put(new Integer(10),200000);
		hm1.put(new Integer(10),300000);

		System.out.println(hm1);
		java.util.IdentityHashMap hm2 = new java.util.IdentityHashMap();

		hm2.put(10,100000);
		hm2.put(10,200000);
		hm2.put(10,300000);
		/*ही गोष्ट नुसते की integer च्या घेतल्या तर apply होत नाही without new कारण integer cache मध्ये हे store होतो ज्याचा एकच ऑब्जेक्ट असतो 
		*/System.out.println(hm2);
	}
}
