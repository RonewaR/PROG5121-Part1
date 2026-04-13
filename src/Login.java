public class Login {

    private String username;
    private String password;
    private String phoneNumber;

    // Constructor
    public Login(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // Check username (must contain "_" and be ≤ 5 characters)
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Check password complexity
    public boolean checkPasswordComplexity() {
        boolean length = password.length() >= 8;
        boolean capital = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*\\d.*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");

        return length && capital && number && special;
    }

    // Check South African phone number (+27...)
    public boolean checkCellPhoneNumber() {
        return phoneNumber.matches("^\\+27\\d{9}$");
    }

    // Register user
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure it contains an underscore and is no more than 5 characters.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure it contains at least 8 characters, a capital letter, a number and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        return "User successfully registered.";
    }

    // Login check
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    // Return login message
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Welcome user, it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
