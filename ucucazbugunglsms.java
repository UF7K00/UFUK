import java.util.Scanner;

public class ucucazbugunglsms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km yol gidilecek: ");
        double distance = input.nextDouble();

        System.out.print("Tek seferlik mi yoksa gidiş-dönüş mü (t/g): ");
        String tripType = input.next();

        double price = distance * 0.50; // Base price is $0.50 per km
        if (tripType.equals("t")) {
        } else if (tripType.equals("g")) {
            price = (distance * 0.50) * 0.8;
        } else {
            System.out.print("Hatalı deneme yaptın. T yada G harflerinden birini kullanman gerekiyor. Program kapatılıyor...");
            System.exit(0);
        }

        System.out.print("Cinsiyetiniz (e/k): ");
        char gender = input.next().charAt(0);

        if (gender == 'e') {
            price = price - (price * 0.30); // 30% off for males
        } else if (gender == 'k') {
            price = price;
        } else {
            System.out.print("Hatalı deneme yaptın. E yada K harflerinden birini kullanman gerekiyor. Program kapatılıyor...");
            System.exit(0);
        }

        System.out.print("Yaşınız: ");
        int age = input.nextInt();

        if (age < 12) {
            price = price - (price * 0.25); // 25% off for kids under 12
        } else if (age >= 15 && age <= 25) {
            price = price - (price * 0.40); // 40% off for ages 15-25
        } else if (age > 50) {
            price = price + (price * 0.20); // 20% extra for ages over 50
        }

        System.out.println("Toplam tutar: $" + price);
    }
}