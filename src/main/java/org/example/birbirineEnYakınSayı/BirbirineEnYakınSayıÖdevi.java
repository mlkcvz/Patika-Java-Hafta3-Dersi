package org.example.birbirineEnYakınSayı;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirbirineEnYakınSayıÖdevi
{
    public static void main(String[] args)
    {
        //Integer veri tipinde bir ArrayList oluşturunuz ve içerisine 10 adet benzersiz ve
        // pozitif eleman ekleyiniz.
        // Bu listteki elemanlardan birbirine en yakın iki elamanı veren kodu yazınız

        //1. ArrayList Oluşturma: 10 adet benzersiz pozitif sayı ekliyoruz.
        //2. Listeyi Sıralama: Sayıları küçükten büyüğe sıralıyoruz.
        //3. Ardışık Elemanlar Arasındaki Farkları Kontrol Etme: Sıralanmış listede,
        // ardışık elemanlar arasındaki farkları karşılaştırıyoruz ve en küçük farkı buluyoruz.

        // 10 adet benzersiz ve pozitif sayıdan oluşan ArrayList
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(7);
        sayilar.add(34);
        sayilar.add(56);
        sayilar.add(11);
        sayilar.add(40);
        sayilar.add(5);
        sayilar.add(9);

        // Sayıları küçükten büyüğe sıralıyoruz
        Collections.sort(sayilar);

        // En küçük farkı bulmak için başlangıçta büyük bir fark değeri seçiyoruz
        int minFark = Integer.MAX_VALUE;
        int sayi1 = -1, sayi2 = -1;

        // Ardışık elemanlar arasındaki farkları kontrol ediyoruz
        for (int i = 0; i < sayilar.size() - 1; i++) {
            int fark = sayilar.get(i + 1) - sayilar.get(i);
            if (fark < minFark) {
                minFark = fark;
                sayi1 = sayilar.get(i);
                sayi2 = sayilar.get(i + 1);
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En yakın iki sayı: " + sayi1 + " ve " + sayi2);

    }
}
