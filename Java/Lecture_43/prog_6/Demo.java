class Demo{
	public static void main(String[] args){
/*
 *	Method:public String concat(String str);
 *
 * 	Description:
 * 	-Concatenate String to this String i.e.Another String Concatenated with first String
 * 	-Implements new array of character whose length is sum of str1.length and str2.length
 *
 * 	parameter:- String
 * 	returnType:- String
 *
 * */
 /**
     * Concatenates the specified string to the end of this string.
     * <p>
     * If the length of the argument string is {@code 0}, then this
     * {@code String} object is returned. Otherwise, a
     * {@code String} object is returned that represents a character
     * sequence that is the concatenation of the character sequence
     * represented by this {@code String} object and the character
     * sequence represented by the argument string.<p>
     * Examples:
     * <blockquote><pre>
     * "cares".concat("s") returns "caress"
     * "to".concat("get").concat("her") returns "together"
     * </pre></blockquote>
     *
     * @param   str   the {@code String} that is concatenated to the end
     *                of this {@code String}.
     * @return  a string that represents the concatenation of this object's
     *          characters followed by the string argument's characters.
     */
   /* public String concat(String str) {
        int otherLen = str.length();
        if (otherLen == 0) {
            return this;
        }
        int len = value.length;
        char buf[] = Arrays.copyOf(value, len + otherLen);
        str.getChars(buf, len);
        return new String(buf, true);
    }*/

	String str1 ="Manojay";
	String str2= "Kulkarni";

	String str3 = str1.concat(str2);

	System.out.println(str3);
		
	}
}
