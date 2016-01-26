
public class Book extends Media
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;   
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
    public int compareTo(Media m){
    	if (m instanceof Book) {
    		if(super.compareTo(m) == 0) {
    			return this.getAuthor().compareTo(((Book) m).getAuthor()); 
    		}
    		return super.compareTo(m);
    	}
    	return 1;
    }
    
    public int compareTo(Book b){
    	return 0;
    }
    public int compareTo(DVD d) {
    	return 0;
    }
}


