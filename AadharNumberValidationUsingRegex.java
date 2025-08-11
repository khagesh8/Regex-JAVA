import java.util.regex.Pattern;
import java.util.regex.Matcher;
class AadharNumberValidationUsingRegex{
	public static void main(String[] args) {
		System.out.print("Enter your aadhar number (with a hyphen '-') : ");		
		String aadhar = new java.util.Scanner(System.in).next();

		if(Pattern.matches("^\\d{4}[-]?\\d{4}[-]?\\d{4}$", aadhar)){
			System.out.println(aadhar + " number is valid");
		}
		else{
			System.out.println(aadhar + " number is invalid");
		}
	}
}