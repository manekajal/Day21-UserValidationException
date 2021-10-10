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

        Assert.assertSame(true,validation.firstName("Mane"));
    }
}
