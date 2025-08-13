// GST number validation
// First 2 digits : state code (numeric)
// Next 10 characters : PAN number (alphanumeric)
// Next 1 digit : entity code (numeric)
// Last 1 character : check alphabet


import java.util.regex.Pattern;
import java.util.regex.Matcher;
class GstNumberValidationUsingRegex{
	public static void main(String[] args) {
		System.out.print("Enter your gst number : ");		
		String gstNum = new java.util.Scanner(System.in).next();

		if(Pattern.matches("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9 A-Z]{1}Z[0-9 A-Z]{1}", gstNum)){
			System.out.println(gstNum + " number is valid");
		}
		else{
			System.out.println(gstNum + " number is invalid");
		}
	}
}