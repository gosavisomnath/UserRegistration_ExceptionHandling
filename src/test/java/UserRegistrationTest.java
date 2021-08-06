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
}