import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationException name = new UserRegistrationException();

    @Test
    public void validfirstName() {
        String firstName = "Ajay";
        boolean result = name.validfirstName(firstName);
        Assert.assertTrue(result);
    }
    @Test
    public void ValidLastName(){
        String lastName = "Gosavi";
        boolean result = name.validLastName(lastName);
        Assert.assertTrue(result);
    }
    @Test
    public void ValidEmail(){
        String email = "abc.xyz@bl.co.in";
        boolean result = name.validEmail(email);
        Assert.assertTrue(result);
    }
    @Test
    public void ValidMobileNumber(){
        String num = "91 1234567890";
        boolean result = name.validMobileNumber(num);
        Assert.assertTrue(result);
    }
}

