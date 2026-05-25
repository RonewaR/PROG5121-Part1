import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // REGISTRATION
        // =========================
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

        // =========================
        // LOGIN
        // =========================
        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter password: ");
        String loginPass = input.nextLine();

        boolean success = user.loginUser(loginUser, loginPass);

        System.out.println(user.returnLoginStatus(success));

        // Stop if login fails
        if (!success) {
            return;
        }

        // =========================
        // MESSAGE SECTION
        // =========================
        System.out.println("\n===== MESSAGE SYSTEM =====");

        System.out.print("Enter recipient number (+27...): ");
        String recipient = input.nextLine();

        System.out.print("Enter your message: ");
        String textMessage = input.nextLine();

        // Create message object
        Message msg = new Message(0, recipient, textMessage);

        // Message length check
        System.out.println("\nMESSAGE LENGTH CHECK:");
        System.out.println(msg.checkMessageLength());

        // Recipient validation
        System.out.println("\nRECIPIENT VALIDATION:");
        System.out.println(msg.checkRecipientCell());

        // Message hash
        System.out.println("\nMESSAGE HASH:");
        System.out.println(msg.createMessageHash());

        // Message ID
        System.out.println("\nMESSAGE ID:");
        System.out.println(msg.getMessageID());

        // Menu options
        System.out.println("\nChoose an option:");
        System.out.println("1 - Send Message");
        System.out.println("2 - Disregard Message");
        System.out.println("3 - Store Message");

        int option = input.nextInt();

        System.out.println(msg.sentMessage(option));

        // Show JSON storage
        if (option == 3) {

            System.out.println("\nJSON STORAGE:");
            System.out.println(msg.storeMessage());
        }

        // Total messages sent
        System.out.println("\nTOTAL MESSAGES SENT:");
        System.out.println(Message.returnTotalMessages());

        input.close();
    }
}
