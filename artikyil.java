import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı gir: ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " yılı artık bir yıldır.");
        } else {
            System.out.println(year + " yılı artık bir yıl değildir.");
        }
    }
}

