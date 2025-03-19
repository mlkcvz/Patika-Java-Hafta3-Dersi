package org.example.FilmVeKoleksiyon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilmVeKoleksiyonÖdevi
{
    public static void main(String[] args)
    {
        List<Film> filmler = new ArrayList<>();

        Film film1 = new Film("matrix",1999,"bilim kurgu",9.0);
        Film film2 = new Film("Esaretin Bedeli ",1994,"Gerilim",8.0);
        Film film3 = new Film("Başlangıç",2010,"Aksiyon",8.5);
        Film film4 = new Film("Prestij",2006,"Korku",3.0);
        Film film5 = new Film("Titanik",1997,"Macera",7.0);

        filmler.add(film1);
        filmler.add(film2);
        filmler.add(film3);
        filmler.add(film4);
        filmler.add(film5);

        // 1. Filmleri IMDb puanına göre büyükten küçüğe sıralama
        Collections.sort(filmler, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return Double.compare(f2.getImdbPuanı(), f1.getImdbPuanı());
            }
        });
        System.out.println("Filmler IMDb puanına göre büyükten küçüğe sıralandı:");
        for (Film film : filmler) {
            System.out.println(film);
        }



        //Film Koleksiyonu Oluşturma ve Sıralama
        //Bir List kullanarak 5 farklı film nesnesi oluşturun ve bu filmleri aşağıdaki gibi sıralayınız:
        //
        //Filmleri IMDb puanına göre büyükten küçüğe sıralayınız.
        //
        //Filmleri yayın yılına göre küçükten büyüğe sıralayınız.
        //
        //Film Filtreleme
        //Bir metod yazın ve şu işlemi yapın:
        //
        //Belirli bir film türünü parametre olarak alarak o türe ait filmleri filtreleyin.
        //
        //Filtrelenmiş filmleri ekrana yazdırın.

        // 2. Filmleri yayın yılına göre küçükten büyüğe sıralama
        Collections.sort(filmler, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return Integer.compare(f1.getFilmYılı(), f2.getFilmYılı());
            }
        });
        System.out.println("\nFilmler yayın yılına göre küçükten büyüğe sıralandı:");
        for (Film film : filmler) {
            System.out.println(film);
        }

        // 3. Film türüne göre filtreleme
        System.out.println("\nBilim Kurgu türündeki filmler:");
        filtrele(filmler, "Bilim Kurgu");
    }

    // Film türüne göre filtreleme metodu
    public static void filtrele(List<Film> filmler, String tur) {
        for (Film film : filmler) {
            if (film.getFilmTürü().equalsIgnoreCase(tur)) {
                System.out.println(film);
            }
        }

    }
}

//Açıklamalar:
//Film Class'ı:
//Film class'ı, ad, yayinYili, tur, ve imdbPuani gibi özelliklere sahip.
// Ayrıca bu özellikler için getter
// ve setter metodları ile toString() metodu var.
//Yapıcı metod (constructor), bu özellikleri başlatmamıza yardımcı oluyor.
//FilmMain Class'ı:
//Film Nesneleri: 5 film nesnesi oluşturuluyor ve bunlar filmListesi adlı ArrayList'e ekleniyor.
//IMDb Puanına Göre Sıralama: Collections.sort() kullanılarak, filmler IMDb puanına göre
// büyükten küçüğe sıralanıyor.
//Yayın Yılına Göre Sıralama: Aynı şekilde, Collections.sort() kullanılarak filmler yayın yılına
// göre küçükten büyüğe sıralanıyor.
//Film Türüne Göre Filtreleme: Belirli bir türdeki filmleri bulmak için filtrele metodu yazılmıştır.
// Bu metot, film türünü parametre olarak alır ve türü eşleşen filmleri ekrana yazdırır.
