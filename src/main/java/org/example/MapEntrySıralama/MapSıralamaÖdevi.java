package org.example.MapEntrySıralama;

import java.util.HashMap;
import java.util.Map;

public class MapSıralamaÖdevi
{
    public static void main(String[] args)
    {
        //Bir Java Map (HashMap, TreeMap veya LinkedHashMap) içindeki tüm key-value çiftlerini ekrana her satırda bir entry olacak şekilde yazdıran bir program yazınız.
        //Kurallar:
        //Map türü HashMap<String, Integer> olarak tanımlanacaktır.
        //Keyler (String), value’ler (Integer) olacaktır.
        //Her bir giriş (entry) ayrı bir satırda olacak şekilde ekrana yazdırılacaktır.
        //Map’e en az 5 farklı giriş (key-value pair) eklenmelidir.
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 85);

        scores.put("Ayşe", 92);

        scores.put("Mehmet", 78);

        scores.put("Zeynep", 90);

        scores.put("Burak", 88);

        // HashMap içindeki tüm key-value çiftlerini satır satır yazdırıyoruz
        for(Map.Entry<String,Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
//Map Üzerinde Dönüş Yapmak
//Bir Map üzerinde key-value çiftlerini satır satır yazdırmak için, map'i döngüyle (iterasyon)
// geçmemiz gerekiyor. Java'da Map üzerindeki öğelere erişmek için genellikle şu yöntemlerden birini
// kullanabiliriz:
//
//entrySet() Yöntemi ile Dönüş
//entrySet() metodu, map'in tüm key-value çiftlerini bir Set<Map.Entry<K, V>> koleksiyonuna dönüştürür.
//Map.Entry<K, V> her bir key-value çiftini temsil eder.
//Bu koleksiyon üzerinden döngü kurarak her bir key ve value'yu ayrı ayrı elde edebiliriz.
//java
//for (Map.Entry<String, Integer> entry : scores.entrySet()) {
//    System.out.println(entry.getKey() + " = " + entry.getValue());
//}
//Detaylı Açıklama:
//scores.entrySet(): Bu ifade, scores adlı map'in tüm key-value çiftlerini bir Set olarak döndürür.
// Yani, bu Set içerisinde her bir öğe, bir key-value çifti içerir.
//for (Map.Entry<String, Integer> entry : scores.entrySet()): Burada, entrySet() metodundan dönen Set
// üzerinden döngüye giriyoruz. Bu döngüde, her bir öğe (entry) bir Map.Entry<String, Integer> nesnesidir.
// Bu nesne, key ve value'yu içinde barındırır.
//entry.getKey(): Bu metot, Map.Entry nesnesinden anahtarı (key) alır. Örneğin, "Ali", "Ayşe", vb.
//entry.getValue(): Bu metot, Map.Entry nesnesinden değeri (value) alır. Örneğin, 85, 92, vb.
//Sonuç olarak, bu döngü her bir key-value çiftini satır satır yazdırır.
