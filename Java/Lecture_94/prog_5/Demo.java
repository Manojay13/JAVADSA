/*
 
 public java.lang.String getName();
  public java.lang.String getParent();
  public java.lang.String getPath();
  public java.lang.String getAbsolutePath();
public boolean canRead();
  public boolean canWrite();
  public boolean isDirectory();
  public boolean isHidden();
  public long lastModified();
  public boolean delete();
  public boolean delete();
  public java.lang.String[] list();
  public int compareTo(java.io.File);

 * */

class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.File fObj1 = new java.io.File("Incubtor.txt");
		fObj1.createNewFile();
		System.out.println(fObj1.getName());
		System.out.println(fObj1.getParent());
		System.out.println(fObj1.getPath());
		System.out.println(fObj1.getAbsolutePath());
		System.out.println(fObj1.canRead());//777 UGO-->User Grpup Execute
		System.out.println(fObj1.isDirectory());
		System.out.println(fObj1.canRead());
		System.out.println(fObj1.isFile());


		java.io.File fObj2 = new java.io.File("/home/manojaykulkarni/Documents/Java/Lecture_94/prog_5/Incubtor.txt");
		String[] files = fObj2.list();

		for(String str: files){
			System.out.println(str);
		}
	}
}
