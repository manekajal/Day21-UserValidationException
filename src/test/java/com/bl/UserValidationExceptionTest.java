package com.bl;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidationExceptionTest {


    @Test
    public void firstName(){

        UserValidationException validation = new UserValidationException();

        Assert.assertSame(true,validation.firstName("Kajal"));
    }
    @Test
    public void lastName(){

        UserValidationException validation = new UserValidationException();

        Assert.assertSame(true,validation.lastName("Mane"));
    }
    @Test
    public void email(){

        UserValidationException validation = new UserValidationException();

        Assert.assertEquals(true,validation.email("m@vsnl.com"));
    }
    @Test
    public void mobileNumber(){

        UserValidationException validation = new UserValidationException();

        Assert.assertEquals(true,validation.mobileNumber("+91-9765326068"));
    }
    public void password(){

        UserValidationException validation = new UserValidationException();

        Assert.assertEquals(true,validation.password("J@vaC0deG##ks"));
    }

}
