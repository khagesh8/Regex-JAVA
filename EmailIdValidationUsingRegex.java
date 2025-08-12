import java.util.regex.Pattern;
import java.util.regex.Matcher;
class EmailIdValidationUsingRegex{
	public static void main(String[] args) {
		System.out.print("Enter your email id : ");		
		String email = new java.util.Scanner(System.in).next();

		if(Pattern.matches("^[A-Z a-z 0-9 %$.]+@[A-Z a-z 0-9 .-]+\\.[A-Z a-z]{2,10}$", email)){
			System.out.println(email + " Id is valid");
		}
		else{
			System.out.println(email + " Id is invalid");
		}
	}
}