import java.util.regex.Pattern;
import java.util.regex.Matcher;
class PhoneNumberValidationUsingRegex{
	public static void main(String[] args) {
		System.out.print("Enter your contact number : ");		
		String phone = "+91-"+(new java.util.Scanner(System.in).next());

		if(Pattern.matches("\\+91-[6-9]{1}[0-9]{9}", phone)){
			System.out.println(phone + " number is valid");
		}
		else{
			System.out.println(phone + " number is invalid");
		}
	}
}