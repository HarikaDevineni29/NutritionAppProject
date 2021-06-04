package com.cg.nutritionapp.constants;

public class AllConstants {
	public static final String PASSWORD_PATTERN="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
	public static final String NAME_PATTERN ="([a-zA-Z]+|[A-Za-z]+[ ]{1}[a-zA-Z]+)";
	public static final String USERNAME_PATTERN = "^[a-zA-Z0-9_]+$";
	public static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    public static final String PHONENUMBER_PATTERN	= "[1-9][0-9]{9}";
//    public static final String INTENSITY_PATTERN	= "[1-9][0-9]{1}";
//	public static final String BLOODGROUP_PATTERN = "^(A|B|AB|O)[+-]$";
	
	public static final String EMPTY_PHONENUMBER="Phone number must contain 10 digits";
	public static final String INVALID_PHONENUMBER="Phone number must contain only digits";
	public static final String EMAIL_CANNOT_BE_EMPTY = "Enter a valid Email Example: example@example.com";
	public static final String PASSWORD_NOT_STRONG ="Password should contain atleast one uppercase alphabet, one lowercase alphabet, one digit, one special character. Min size:8, Max Size:20";
	
//	public static final String  ADMIN_CANNOT_BE_EMPTY = "Admin name cannot be Empty and should contain only alphabets";
	
	public static final String  USER_CANNOT_BE_EMPTY = "Username cannot be Empty and should contain only alphabets";
	public static final String  ROLE_INVALID = "Invalid Role! Enter: Customer or Dietician";
	public static final String  SLOT_INVALID = "Invalid Slot! Enter: morning meal or evening meal";
	
	public static final String  FOODTYPE_INVALID = "Invalid Food Type! Enter: veg or non veg";
	public static final String INVALID_INTENSITY="Intensity number should be between 1 and 10.";
	
	
	public static final String EMPTY_CUSTOMER = "Customer name cannot be Empty and should contain only alphabets";
	public static final String EMPTY_DIETICIAN= "Dietician cannot be Empty and should contain only alphabets";
//	public static final String EMPTY_LOCATION = "Location cannot be Empty and should contain only alphabets";
//	public static final String EMPTY_HOSPITALNAME = "Hospital name cannot be Empty and should contain only alphabets";
	
//	public static final String EMPTY_PATIENT = "Patient name cannot be Empty and should contain only alphabets";
	//public static final String EMPTY_ADDRESS = "Address cannot be Empty and should contain only alphabets";
	//public static final String BLOODGROUP_INVALID = "Invalid BloodGroup Enter: A+ or A- or  B+ or B- or  AB+ or AB- or  O+ or O-";
	public static final String GENDER_INVALID = "Invalid Gender! Enter: Male or Female or Others";
//	public static final String INVALID_AGE = "Enter Valid Age";
	
	public static final String STATUS_INVALID = "Invalid Status! Enter: Active or Blocked";

	
	
	


}
