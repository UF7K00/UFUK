import java.util.Scanner;
// kullanıcıdan veri alma
public class  {
    public static void main(String[] args) {

        int mat, din, ing, felsefe, tarih;
        Scanner input = new Scanner(System.in);
        System.out.print("Mat notunu gir: ");
        mat = input.nextInt();
        System.out.print("tarih notunu gir: ");
        tarih = input.nextInt();
        System.out.print("felsefe notunu gir: ");
        felsefe = input.nextInt();
        System.out.print("ing notunu gir: ");
        ing = input.nextInt();
        System.out.print("din notunu gir: ");
        din = input.nextInt();

        int ortalama = (mat + din + felsefe + ing + tarih) / 5;
        double sonuc = ortalama /5;
        System.out.println("Ortalaman: " + ortalama );
        System.out.println(ortalama > 75 ? "notlar iyi" :"notlar kötü");
    }
}