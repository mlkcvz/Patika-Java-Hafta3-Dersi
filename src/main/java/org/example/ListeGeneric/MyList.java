package org.example.ListeGeneric;

import java.util.Arrays;

public class MyList<T> {
    private T[] array; // Generic diziyi tutan değişken
    private int size; // Dizideki mevcut eleman sayısını tutar
    private int capacity; // Dizinin toplam kapasitesini tutar

    // Varsayılan constructor (kapasite 10 olarak ayarlanır)
    public MyList() {
        this.capacity = 10; // Başlangıç kapasitesini 10 olarak belirler
        this.array = (T[]) new Object[this.capacity]; // Generic dizi oluşturulur
        this.size = 0; // Başlangıçta eleman sayısı sıfırdır
    }

    // Kullanıcının belirttiği kapasite ile constructor
    public MyList(int capacity) {
        this.capacity = capacity; // Kullanıcının belirlediği kapasite atanır
        this.array = (T[]) new Object[this.capacity]; // Belirtilen kapasiteyle dizi oluşturulur
        this.size = 0; // Başlangıçta eleman sayısı sıfırdır
    }

    // Dizide bulunan eleman sayısını döndüren metot
    public int size() {
        return this.size;
    }

    // Dizinin toplam kapasitesini döndüren metot
    public int getCapacity() {
        return this.capacity;
    }

    // Diziye eleman ekleyen metot
    public void add(T data) {
        if (size == capacity) { // Eğer dizinin kapasitesi dolmuşsa,
            expandCapacity(); // Kapasiteyi iki katına çıkaran metot çağrılır
        }
        array[size++] = data; // Yeni eleman eklenir ve boyut artırılır
    }

    // Dizinin kapasitesini iki katına çıkaran yardımcı metot
    private void expandCapacity() {
        this.capacity *= 2; // Kapasiteyi iki katına çıkar
        T[] newArray = (T[]) new Object[this.capacity]; // Yeni kapasitede bir dizi oluştur
        System.arraycopy(array, 0, newArray, 0, size); // Eski dizinin elemanlarını yeni diziye kopyala
        this.array = newArray; // Yeni dizi referansını eski diziye ata
    }

    public void remove(int index) {// Belirtilen indeksteki elemanı silen metot

            if (index < 0 || index >= size) { // Geçersiz indeks kontrolü
                System.out.println("Hata: Geçersiz indeks!");
                return;
            }

            // Silinecek elemandan sonraki tüm elemanları sola kaydır
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            array[size - 1] = null; // Son elemanı null yap
            size--; // Eleman sayısını bir azalt
        }

    // Belirtilen indeksteki elemanı döndüren metot
    public T get(int index) {
        if (index < 0 || index >= size) { // Geçersiz indeks kontrolü
            System.out.println("Hata: Geçersiz indeks!");
            return null;
        }
        return array[index]; // Belirtilen indeksteki elemanı döndür
    }

    // Belirtilen indeksteki elemanı güncelleyen metot
    public void set(int index, T data) {
        if (index < 0 || index >= size) { // Geçersiz indeks kontrolü
            System.out.println("Hata: Geçersiz indeks!");
            return;
        }
        array[index] = data; // Belirtilen indeksteki elemanı güncelle
    }

    // Listenin içeriğini String olarak döndüren metot
    @Override
    public String toString() {
        return "[" + Arrays.stream(array, 0, size)
                .map(String::valueOf)
                .reduce((x, y) -> x + ", " + y)
                .orElse("") + "]";
    }

    // Listeyi dizi olarak döndüren metot
    public T[] toArray() {
        return Arrays.copyOf(array, size); // Dizinin yalnızca kullanılan kısmını döndür
    }

    // Belirtilen aralıktaki elemanlardan yeni bir liste oluşturan metot
    public MyList<T> subList(int start, int end) {
        if (start < 0 || end > size || start > end) { // Geçersiz indeks kontrolü
            System.out.println("Hata: Geçersiz indeks aralığı!");
            return null;
        }
        MyList<T> subList = new MyList<>(end - start); // Yeni liste oluştur
        for (int i = start; i < end; i++) {
            subList.add(array[i]); // Yeni listeye elemanları ekle
        }
        return subList;
    }

    // Belirtilen elemanın listede olup olmadığını kontrol eden metot
    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return true; // Eleman bulundu
            }
        }
        return false; // Eleman bulunamadı
    }
    // Listeyi temizleyen metot
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null; // Tüm elemanları null yap
        }
        size = 0; // Eleman sayısını sıfırla
    }
    // Listenin boş olup olmadığını kontrol eden metot
    public boolean isEmpty() {
        return size == 0;
    }

    // Belirtilen elemanın ilk bulunduğu indeksi döndüren metot
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i; // İlk bulunan indeks döndürülür
            }
        }
        return -1; // Eleman bulunamazsa -1 döndürülür
    }

    // Belirtilen elemanın son bulunduğu indeksi döndüren metot
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i; // Son bulunan indeks döndürülür
            }
        }
        return -1; // Eleman bulunamazsa -1 döndürülür
    }
    }
