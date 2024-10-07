package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String fNameValidate(String fName) throws CustomException{
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
//                Pattern compiledPattern = Pattern.compile(pattern);
//                Matcher matcher = compiledPattern.matcher(fName);
        if(!Pattern.matches(pattern, fName)){
            throw new CustomException("Invalid first name. Must start with a capital letter and have at least 3 characters.");
        }
        return "HAPPY";
    }
    public static String lNameValidate(String lName) throws CustomException{
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
//                Pattern compiledPattern = Pattern.compile(pattern);
//                Matcher matcher2 = compiledPattern.matcher(lName);
        if(!Pattern.matches(pattern, lName)){
            throw new CustomException("Invalid last name.");
        }
        return "HAPPY";

    }
    public static String emailValidate(String email) throws CustomException{
        String pattern2 = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
//                Pattern compiledPattern2 = Pattern.compile(pattern2);
//                Matcher matcher3 = compiledPattern2.matcher(email);
        if (!Pattern.matches(pattern2,email)){
            throw new CustomException("Invalid email.");
        }
        return "HAPPY";

    }
    public static String phoneNumberValidate(String phoneNumber) throws CustomException{
        String mobileRegex = "^\\d{2} \\d{10}$";
        Pattern CompiledMobile = Pattern.compile(mobileRegex);
        Matcher matcherPhone =CompiledMobile.matcher(phoneNumber);
        if(!Pattern.matches(mobileRegex,phoneNumber)) {
            throw new CustomException("Invalid Phone Number.");
        }
        return "HAPPY";
    }
    public static String passwordValidate(String password) throws CustomException{
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=^[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~]*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~][^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~]*$).{8,}$";
//                Pattern compiledPassword=Pattern.compile(passwordRegex);
//                Matcher matchPassword=compiledPassword.matcher(password);
        if(!Pattern.matches(passwordRegex,password)) {
            throw new CustomException("Invalid Password.");
        }
        return "HAPPY";
    }
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name");
        String fName=sc.next();
        System.out.println(fNameValidate(fName));


        System.out.println("Enter last name");
        String lName=sc.next();
        System.out.println(lNameValidate(lName));


        System.out.println("Enter the number of emails : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Enter email-id ");
            String email = sc.next();
            System.out.println(emailValidate(email));
        }

        System.out.println("Enter mobile number with country code, space followed by 10 digit number");
        sc.nextLine();
        String phoneNumber=sc.nextLine();
        System.out.println(phoneNumberValidate(phoneNumber));


        System.out.println("Enter password minimum 8 characters, at least 1 uppercase and 1 number and exactly 1 special character");
        String password=sc.nextLine();
        System.out.println(passwordValidate(password));

    }
}