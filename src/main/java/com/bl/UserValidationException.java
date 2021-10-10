package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class UserValidationException {
    public static String firstName(String firstName) throws UserValidationCustomException {
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
            throw new UserValidationCustomException(" Please Enter Proper : ");

        }


        return firstName;
    }
    public static String lastName(String lastName) throws UserValidationCustomException{
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
            throw new UserValidationCustomException(" Please Enter Proper : ");


        }
        return lastName;
    }
    public long email(String email)throws UserValidationCustomException
    {
        try {
            String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            Pattern r = Pattern.compile(pattern);

            Matcher m = r.matcher(email);


            if (m.matches()) {
                System.out.println(" email Matched :");

            } else {
                System.out.println("email  No Matched :");
            }
        }
        catch (PatternSyntaxException e){
            throw new UserValidationCustomException(" Please Enter Proper : ");


        }

        return 0;
    }

    public static long mobileNumber(String  str) throws  UserValidationCustomException{
        try {
            String pattern = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
            Pattern r = Pattern.compile(pattern);

            Matcher m;
            m = r.matcher(str);

            if (m.matches()) {
                System.out.println(" Mobile Number is Matched :");

            } else {
                System.out.println("  Mobile Number is Not Matched :");
            }
        }
        catch (PatternSyntaxException e){
            throw new UserValidationCustomException(" Please Enter Proper : ");


        }

        return 0;
    }
    public static long password(String password) throws UserValidationCustomException {
        try {
            String pattern = "(?=.*?[A-Z])(?=.*?[0-9])[A-Za-z]{8,}";

            Pattern r = Pattern.compile(pattern);

            Matcher m;
            m = r.matcher(password);

            if (m.matches()) {
                System.out.println(" Password is Matched :");

            } else {
                System.out.println(" Password is  Not Matched :");
            }
        }
        catch (PatternSyntaxException e){
            throw new UserValidationCustomException(" Please Enter Proper : ");

        }

        return 0;
    }
}

