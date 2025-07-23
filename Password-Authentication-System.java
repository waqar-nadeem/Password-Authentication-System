import java.util.Scanner;

public class PasswordAuthenticationSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] correctPassword = {'w', 'a', 'q', 'a', 'r'};  
        int maxAttempts = 3; 
        int attempts = 0; 
        System.out.println("Passowrd Authentication System");
        while (attempts < maxAttempts) {
            System.out.print("Enter your password: ");
            String enteredPassword = s.nextLine(); 
            if (enteredPassword.length() == correctPassword.length) {
                boolean isCorrect = true;
                for (int i = 0; i < correctPassword.length; i++) {
                    if (enteredPassword.charAt(i) != correctPassword[i]) {
                        isCorrect = false;
                        break;
                    }
                }
                if (isCorrect) {
                    System.out.println("Password correct! Access Granted!");
                    break;
                } else {
                    attempts++;
                    System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempts remaining.");
                }
            } else {
                attempts++;
                System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempts remaining.");
            }
            if (attempts == maxAttempts) {
                System.out.println("You have exceeded the maximum number of attempts. Access Blocked!");
            }
        }

        s.close();
    }
}
