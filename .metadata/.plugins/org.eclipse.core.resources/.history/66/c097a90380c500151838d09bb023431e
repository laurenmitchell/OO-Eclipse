abstract class Media implements Comparable<Media>
{	
	protected String title;
 	public String getTitle()  { return title; }

	public int compareTo(Media m) {
		// Actually, I think we can use String compareTo
		String myClassName = this.getClass().getName();
		int result = myClassName.compareTo(m.getClass().getName());
		return result;
	}
		
}