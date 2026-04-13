import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== REGISTRATION =====");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone number (+27...): ");
        String phone = input.nextLine();

        Login user = new Login(username, password, phone);

        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);

        // Stop if registration failed
        if (!registrationMessage.equals("User successfully registered.")) {
            System.out.println("Registration failed. Please restart the program.");
            return;
        }

        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter password: ");
        String loginPass = input.nextLine();

        boolean success = user.loginUser(loginUser, loginPass);

        System.out.println(user.returnLoginStatus(success));
    }
}
