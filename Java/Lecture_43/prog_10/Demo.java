class Demo{
/*
 *
 * */
 /**
     * Compares two strings lexicographically, ignoring case
     * differences. This method returns an integer whose sign is that of
     * calling {@code compareTo} with normalized versions of the strings
     * where case differences have been eliminated by calling
     * {@code Character.toLowerCase(Character.toUpperCase(character))} on
     * each character.
     * <p>
     * Note that this method does <em>not</em> take locale into account,
     * and will result in an unsatisfactory ordering for certain locales.
     * The java.text package provides <em>collators</em> to allow
     * locale-sensitive ordering.
     *
     * @param   str   the {@code String} to be compared.
     * @return  a negative integer, zero, or a positive integer as the
     *          specified String is greater than, equal to, or less
     *          than this String, ignoring case considerations.
     * @see     java.text.Collator#compare(String, String)
     * @since   1.2
     */
   /* public int compareToIgnoreCase(String str) {
        return CASE_INSENSITIVE_ORDER.compare(this, str);
    }*/
    public static void main(String[] args){
    	String str1 ="MANOJAY";
	String str2 ="Manojay";
	String str3 ="ManojayKulkarni";

	System.out.println(str1.compareToIgnoreCase(str2));
	System.out.println(str2.compareToIgnoreCase(str3));
    }
}
