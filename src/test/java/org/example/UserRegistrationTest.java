package org.example;
import org.example.CustomException;
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    @Test
    public void fNameTest() throws CustomException{
        String fname= String.valueOf(Main.fNameValidate("Aamir"));
        Assert.assertEquals("HAPPY",fname);

    }
    @Test
    public void lNameTest()throws CustomException{
        String lname= String.valueOf(Main.lNameValidate("Aamir"));
        Assert.assertEquals("HAPPY",lname);

    }

    @Test
    public void emailTest()throws CustomException{
        String email= String.valueOf(Main.emailValidate("saq.aam@blz.ami.zs"));
        Assert.assertEquals("HAPPY",email);
    }

    @Test
    public void phoneNumberTest() throws CustomException {
        String phoneno= String.valueOf(Main.phoneNumberValidate("91 9897198971"));
        Assert.assertEquals("HAPPY",phoneno);
    }
    @Test
    public void passwordTest() throws CustomException {
        String password= String.valueOf(Main.passwordValidate("asA!1asa"));
        Assert.assertEquals("HAPPY",password);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test.sds@example.co.ij",
            "user.name+tag+sorting@example.com",
            "user.name@example.co.uk",
            "invalid-email@",
            "@example.com",
            "user@.com.my"
    })
    void validEmail (String mail) throws CustomException{
        String result= String.valueOf(Main.emailValidate(mail));
        Assert.assertEquals("HAPPY",result);
    }
}