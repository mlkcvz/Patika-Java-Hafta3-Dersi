package org.example.FilmVeKoleksiyon;

public class Film
{
    //Film Classı Tasarımı
    //Bir Film classı oluşturunuz. Bu classın aşağıdaki özelliklere sahip olması gerekmektedir:
    //Film adı (String)
    //Yayın yılı (int)
    //Film türü (String)
    //IMDb puanı (double)
    private String filmAdı;
    private int filmYılı;
    private String filmTürü;
    private double imdbPuanı;

    public Film(String filmAdı, int filmYılı , String filmTürü , double imdbPuanı)
    {
        this.filmAdı = filmAdı;
        this.filmYılı = filmYılı;
        this.filmTürü = filmTürü;
        this.imdbPuanı = imdbPuanı;

    }

    public void setFilmAdı(String filmAdı) {
        this.filmAdı = filmAdı;
    }

    public void setFilmYılı(int filmYılı) {
        this.filmYılı = filmYılı;
    }

    public void setFilmTürü(String filmTürü) {
        this.filmTürü = filmTürü;
    }

    public void setImdbPuanı(double imdbPuanı) {
        this.imdbPuanı = imdbPuanı;
    }

    public String getFilmAdı() {
        return filmAdı;
    }

    public int getFilmYılı() {
        return filmYılı;
    }

    public String getFilmTürü() {
        return filmTürü;
    }

    public double getImdbPuanı() {
        return imdbPuanı;
    }

    @Override
    public String toString() {
        return "Film{" +
                "ad='" + filmAdı + '\'' +
                ", yayinYili=" + filmYılı +
                ", tur='" + filmTürü + '\'' +
                ", imdbPuani=" + imdbPuanı +
                '}';
    }
}
