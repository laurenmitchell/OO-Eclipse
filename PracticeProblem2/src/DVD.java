public class DVD extends Media
{
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
    
    
    public int compareTo(Media m) {
    	// Case 1, both are DVDs
    	if(m instanceof DVD){
    		if(super.compareTo(m) == 0) {
    			if(this.getYear() > ((DVD) m).getYear()) return 1; 
    			else if(this.getYear() < ((DVD) m).getYear()) return -1;	
    		}
    		else return super.compareTo(m);
    	}
    	//Case 2, one is a DVD one is a Book
    	return -1;
    	
    }
    
    
    
    /*public int compareTo(Media m){
    	if( m instanceof DVD){
    		if(super.compareTo(m) == 0){
    			if(this.getYear() > ((DVD) m).getYear()) return 1; 
    			else if(this.getYear() < ((DVD) m).getYear())return -1;	
    		}
    	}
    	return super.compareTo(m);
    }
	public int compareTo(Media m){
		if (m instanceof DVD) {
			if(this.getYear() > ((DVD) m).getYear()) return 1; 
			else if(this.getYear() < ((DVD) m).getYear())return -1;	
		} 
		else return super.compareTo(m);
		return 0;
	} */
}
