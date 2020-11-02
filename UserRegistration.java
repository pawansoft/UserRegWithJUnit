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

    public boolean checkPassword(String passcode) {
        return (passcode.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
    }

    public String moodAnalyse(String fName, String lName, String phoneNumber, String email, String password ) {
        if(checkFName(fName) == true && checkLName(lName) == true && checkEmail(email) == true && checkPhoneNumber(phoneNumber) == true && checkPassword(password) == true){
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }
}
