package org.example.HarfBulma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HarfBulmaOyunuÖdevi {
    public static void main(String[] args) {
        // 4 elemanlı bir ArrayList oluşturuyoruz ve içine rastgele harfler ekliyoruz.
        //String veri tipinde 4 elemanlı bir ArrayList oluşturunuz ve içine rastgele harfler ekleyiniz.
        //
        //Kullanıcıdan harf girişi alınız.
        //
        //Eğer harf listede varsa, ilgili elemanı "found" ile değiştiriniz.
        //
        //Eğer harf listede yoksa, listeye ekleyiniz.
        //
        //Bu işlemi 4 kez tekrarlayınız (Kullanıcı 4 farklı harf girecek).
        //
        //Program sonunda güncellenmiş listeyi ekrana yazdırınız.
        List<String> listem = new ArrayList<>();
        listem.add("M");
        listem.add("F");
        listem.add("H");
        listem.add("C");

        // Kullanıcıdan harf girişi alınıyor
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 tane büyük harf giriniz");

        for (int i = 0; i < 4; i++) {
            char harf = scanner.next().charAt(0);  // Kullanıcıdan sadece ilk karakter alınıyor

            boolean bulundu = false;  // Harfin bulunduğu durumu takip etmek için bir bayrak

            for (int j = 0; j < listem.size(); j++) {
                // Listede girilen harf var mı kontrol ediliyor
                if (listem.get(j).equals(String.valueOf(harf))) {
                    // Eğer harf varsa, "found" ile değiştiriyoruz
                    listem.set(j, "found");
                    bulundu = true;
                    break;  // Harf bulunduğunda döngüden çıkıyoruz
                }
            }

            // Eğer harf listede yoksa, listeye ekliyoruz
            if (!bulundu) {
                listem.add(String.valueOf(harf));
            }

            // Güncellenmiş listeyi yazdırıyoruz
            System.out.println("Güncellenmiş liste: " + listem);
        }

        // Program sonunda güncellenmiş listeyi yazdırıyoruz
        System.out.println("Son halindeki liste: " + listem);
    }
}

//Özet:
//String.valueOf(harf) ile char'ı String'e dönüştürdük.
//replace yerine set ile listeyi güncelledik.
//4 kez harf almak için bir döngü kullandık.
//Bu düzeltmelerle birlikte programınız doğru bir şekilde çalışacaktır!