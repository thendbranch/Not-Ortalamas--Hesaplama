// https://app.patika.dev/
// https://app.patika.dev/thendbranch


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Soru :
            Not Ortalaması Hesaplayan Program
                Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
                kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev :
            Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise
            ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...
         */

        //Soru Çözüm :
        // 1. Aşama değerlerimizi tanıtalım.

        int mat, fiz, kim, tur, tar, muz ;

        // 2. Aşama Kullanıcıdan sınav notunu almak için Scanner komutu.
        // import java.util.Scanner; ile kütüphanemizi tanıttık. Artık değerleri isteyebiliriz.
        Scanner veri = new Scanner(System.in);
        System.out.println("!! Lütfen Sınav Notlarınızı Giriniz !!");

        System.out.print("Matematik : ");
        mat = veri.nextInt();

        System.out.print("Fizik : ");
        fiz = veri.nextInt();

        System.out.print("Kimya : ");
        kim = veri.nextInt();

        System.out.print("Türkçe : ");
        tur = veri.nextInt();

        System.out.print("Tarih : ");
        tar = veri.nextInt();

        System.out.print("Müzik : ");
        muz = veri.nextInt();


        // 3. Aşama kullanıcıdan değerler alındı ortalama bulalım.
        int toplam = (mat + fiz + kim + tur + tar + muz);
        double ortalama = toplam / 6.0;

        System.out.println("Derslerinizin toplam ortalaması : " + ortalama);

        // Ödev Çözüm :


        String gecim = ortalama>60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(gecim);

    }
}