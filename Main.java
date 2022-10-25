import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
        // ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = not.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = not.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = not.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = not.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = not.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = not.nextInt();

        int toplam;
        double ortalama;
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam /6;

        System.out.println("Ortalamanız = "+ ortalama);

        String str = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(str);
    }
}