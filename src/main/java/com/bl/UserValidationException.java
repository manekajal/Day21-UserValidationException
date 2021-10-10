package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class UserValidationException {
    public static String firstName(String firstName) {
        try {
            String pattern = "^[A-Z][a-zA-Z]{3,}";

            Pattern r = Pattern.compile(pattern);

            Matcher m = r.matcher(firstName);

            if (m.matches()) {
                System.out.println(" First Name is matched ");
            } else {
                System.out.println(" Not Matched ");
            }
            System.out.println();
        }
        catch (PatternSyntaxException e){
            System.out.println("Invalid Regex"+ e.getMessage());

        }


        return firstName;
    }
    public static String lastName(String lastName) {
        try {
            String pattern = "^[A-Z][a-zA-Z]{3,}";

            Pattern r = Pattern.compile(pattern);

            Matcher m = r.matcher(lastName);

            if (m.matches()) {
                System.out.println(" Last Name is matched ");
            } else {
                System.out.println(" Not Matched ");
            }
            System.out.println();
        }
        catch (PatternSyntaxException e){
            System.out.println("Invalid Regex"+ e.getMessage());

        }
        return lastName;
    }
    public long email(String email)
    {
        String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(email);


        if (m.matches()) {
            System.out.println(" email Matched :");

        } else {
            System.out.println("email  No Matched :");
        }
        return 0;
    }

    public static long mobileNumber(String  str){
        String pattern = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
        Pattern r= Pattern.compile(pattern);

        Matcher m;
        m = r.matcher(str);

        if(m.matches()){
            System.out.println(" Mobile Number is Matched :" );

        }else
        {
            System.out.println("  Mobile Number is Not Matched :");
        }
        return 0;
    }
}

