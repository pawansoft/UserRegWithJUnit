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
        boolean isEmailIdInvalid = userRegistration.checkEmail("pk.soft29@.com");
        Assert.assertFalse(isEmailIdInvalid);
    }
}
