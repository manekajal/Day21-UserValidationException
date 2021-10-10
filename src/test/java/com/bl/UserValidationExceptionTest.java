package com.bl;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class UserValidationExceptionTest {


    @Test
    public void firstName(){

        UserValidationException validation = new UserValidationException();

        try {

            Assert.assertSame(true,validation.firstName("Kajal"));
        } catch (UserValidationCustomException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void lastName(){

        UserValidationException validation = new UserValidationException();

        try {
            Assert.assertSame(true,validation.lastName("Mane"));
        } catch (UserValidationCustomException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void email(){

        UserValidationException validation = new UserValidationException();

        try {
            Assert.assertEquals(true,validation.email("m@vsnl.com"));
        } catch (UserValidationCustomException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void mobileNumber(){

        UserValidationException validation = new UserValidationException();

        try {
            Assert.assertEquals(true,validation.mobileNumber("+91-9765326068"));
        } catch (UserValidationCustomException e) {
            e.printStackTrace();
        }
    }
    public void password(){

        UserValidationException validation = new UserValidationException();

        try {
            Assert.assertEquals(true,validation.password("J@vaC0deG##ks"));
        } catch (UserValidationCustomException e) {
            e.printStackTrace();
        }
    }

}
