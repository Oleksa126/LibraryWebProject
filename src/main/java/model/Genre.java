package model;


import javax.persistence.*;

/**
 * Created by oleks on 25.01.2017.
 */
@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "genre")
    private String genre;

    public Genre(){}

    public Genre(long id){this.id = id;}

    public Genre(String genre){setGenre(genre);}

    public void setGenre(String genre){this.genre = genre;}

    public String getGenre(){return genre;}
}
