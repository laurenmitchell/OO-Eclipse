
public class UserUtility {
	//public static void main(String[] args){
		//String userName =  createUser("lauren", "mitchell");
		//System.out.println(userName);
	//}
	public static String createUser (String first, String last){
		String firstName = first.substring(0,3);
		String lastName = last.substring(last.length()-3);
		return firstName+lastName;
	}

	//public static void main(String[] args){
		//String firstName;
		//String lastName;
		//System.out.println("please enter in first name);
		//firstName = firstName.substring(0,2);
		
	//}
}

