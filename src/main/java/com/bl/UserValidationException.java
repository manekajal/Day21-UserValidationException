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

}
