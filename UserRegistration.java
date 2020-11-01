public class UserRegistration {
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean checkLName(String lName) {
        return (lName.matches("[A-Z][a-z]{3,}"));
    }
}
