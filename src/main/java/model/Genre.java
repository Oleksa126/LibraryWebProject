package model;

/**
 * Created by oleks on 25.01.2017.
 */
public class Genre {
    private String genre;

    Genre(){}

    public Genre(String genre){setGenre(genre);}

    public void setGenre(String genre){this.genre = genre;}

    public String getGenre(){return genre;}
}
