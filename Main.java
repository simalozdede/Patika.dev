import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);



    }
}