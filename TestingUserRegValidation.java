import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegValidation {

    @Test
    public void testUserFirstName_whenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFNameValid = userRegistration.checkFName("Pawan");
        Assert.assertTrue(isFNameValid);
    }

    @Test
    public void testFirstName_WhenValueIsInvalid_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFNameValid = userRegistration.checkFName("pawan");
        Assert.assertFalse(isFNameValid);
    }

    @Test
    public void testLastName_WhenValueIsValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLNameValid = userRegistration.checkLName("Kumar");
        Assert.assertTrue(isLNameValid);
    }

    @Test
    public void testLastName_WhenValueIsInvalid_ShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();
        boolean isLNameInvalid = userRegistration.checkLName("kumar");
        Assert.assertFalse(isLNameInvalid);
    }

    @Test
    public void testEmailId_WhenValueIsValid_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailIdValid = userRegistration.checkEmail("pk.soft29@gmail.com");
        Assert.assertTrue(isEmailIdValid);
    }

    @Test
    public void testEmailId_WhenValueIsInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailIdInValid = userRegistration.checkEmail("pk.soft29@.com");
        Assert.assertFalse(isEmailIdInValid);
    }

    @Test
    public void testMobileNum_WhenValueIsValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberValid = userRegistration.checkPhoneNumber("91 8083373213");
        Assert.assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testMobileNum_WhenValueIsInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInvalid = userRegistration.checkPhoneNumber("8083373213");
        Assert.assertFalse(isPhoneNumberInvalid);
    }

    @Test
    public void testPassword_WhenSatisfyRule2_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordValid =  userRegistration.checkPassword("cjsolsPhr");
        Assert.assertTrue(isPasswordValid);
    }

    @Test
    public void testPassword_WhenNotSatisfyRule2_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInvalid =  userRegistration.checkPassword("cjsolshr");
        Assert.assertFalse(isPasswordInvalid);
    }
}

