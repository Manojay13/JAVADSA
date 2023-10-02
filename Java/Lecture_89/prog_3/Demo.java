class Demo{
	public static void main(String[] args){
		String str1 = "MK";
		String str2 = "SK";
		String str3 = "PK";
		java.util.HashSet  hs = new java.util.HashSet();

		hs.add(str1);
		hs.add(str2);
		hs.add(str3);
		System.out.println(hs);

		System.out.println("str1="+str1.hashCode());
		System.out.println("str2="+str2.hashCode());
		System.out.println("str3="+str3.hashCode());
	/*	hashCode =0;
		A  B  C  D  E  F  G  H  I
		65 66 67 68 69 70 71 72	73
		J  K  L  M  N  O  P  Q  R 
		74 75 76 77 78 79 80 81 82
		S  T  U  V  W  X  Y  Z 
		83 84 85 86 87 88 89 90
		s[0] = M
		s[1] = K
		hashcode =s[0]*31^1+s[1]
			 =77*31+75=2462

			 2462%16=11
		s[0] = S
		s[1] = K
		hashcode =s[0]*31^1+s[1]
			 =83*31+75=2648

			 2468%16=8
		s[0] = P
		s[1] = K
		hashcode =s[0]*31^1+s[1]
			 =80*31+75=2555

			 2555%16=14

			 8  11 14
			 SK PK MK
		*/
	}
}
