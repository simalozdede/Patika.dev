import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        double a;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();

        double alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire Diliminin Alanı: " + alan);


    }
}