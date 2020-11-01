public class UserRegistration {
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean checkLName(String lName) {
        return (lName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean checkEmail(String emailId) {
        return (emailId.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    public boolean checkPhoneNumber(String phoneNo) {
        return (phoneNo.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }
}
