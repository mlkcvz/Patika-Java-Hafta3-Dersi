package org.example.FrekansBulma;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrekansBulmaÖdevi
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime giriniz : ");
        String kelime = scanner.nextLine().toLowerCase(); // Küçük harfe çeviriyoruz;

        // Harflerin frekansını tutacak bir Map oluşturuyoruz
        Map<Character, Integer> frekans = new HashMap<>();

        // Her harfi kontrol edip frekansını artırıyoruz
        for (char harf : kelime.toCharArray()) {
            if (Character.isLetter(harf)) { // Sadece harfleri dikkate alıyoruz
                frekans.put(harf, frekans.getOrDefault(harf, 0) + 1);
            }
        }




    }
}

//getOrDefault(k, v) metodunda:
//k: Aradığınız anahtardır.
//v: Eğer k anahtarına karşılık gelen bir değer yoksa, döndürülecek varsayılan değeri belirtirsiniz.
//Detaylı Açıklama:
//getOrDefault(harf, 0) ifadesi, harf anahtarına karşılık gelen bir değer olup olmadığını kontrol eder.
// Eğer bu anahtar (harf) daha önce Map'e eklenmişse, o anahtarın mevcut değeri döndürülür.
// Eğer harf anahtarı Map içinde yoksa, bu durumda 0 döndürülür.
//
//Yani, bu metod şu iki durumu kontrol eder:
//
//Eğer harf anahtarına ait bir değer varsa, o değeri döndürür.
//Eğer harf anahtarı Map içinde yoksa, 0 döndürür (varsayılan değer).
