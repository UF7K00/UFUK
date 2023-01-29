import java.util.Random;
import java.util.Scanner;

public class sifrecikkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the characters you want to use in the password: ");
        String sayilar = input.next();
        System.out.print("Enter the password to be cracked: ");
        String password = input.next();
        String guessedPassword = "";
        int step = 0;
        while (true) {
            step++; // increment step before checking for match
            System.out.println("Trying password... " + guessedPassword);
            if (password.equals(guessedPassword)) {
                break;
            } else {
                guessedPassword = "";
                for (int i = 0; i < password.length(); i++) {
                    guessedPassword += sayilar.charAt(rand.nextInt(sayilar.length()));
                }
            }
        }
        System.out.println("Your password is " + password + " and it was cracked in " + step + " steps.");
    }
}
