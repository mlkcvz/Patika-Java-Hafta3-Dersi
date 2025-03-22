package org.example.GenericMethod;

public class GenericMethodÖdevi
{
    //Ödev - Generic Metot Yazımı
    //Bir generic metot (printArray) yazınız ve bu metot, verilen farklı veri türlerinden
    // (Integer, String, Double vs.) oluşan dizileri ekrana yazdırsın.
    //Örnek Kullanım:
    //Integer[] intArray = {1, 2, 3, 4, 5};
    //String[] strArray = {"Java", "Generics", "Ödev"};
    //printArray(intArray);
    //printArray(strArray);
    //Beklenen Çıktı:
    //1 2 3 4 5
    //Java Generics Ödev
    public class Main {

        // Generic metot
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println(); // Satır sonu
        }

        public static void main(String[] args) {
            // Integer dizisi
            Integer[] intArray = {1, 2, 3, 4, 5};
            // String dizisi
            String[] strArray = {"Java", "Generics", "Ödev"};

            // Generic metot kullanımı
            printArray(intArray);  // Çıktı: 1 2 3 4 5
            printArray(strArray);  // Çıktı: Java Generics Ödev
        }
    }

}
