package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleks on 25.01.2017.
 */
@Entity
@Table(name = "book")
public class Book implements Serializable{

    private List<Author> authorList;

    private List<Genre> genreList;

    @Column(name = "title")
    private String title;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Book(){}

    public Book(long id){this.id = id;}

    public Book(String title, Author author, Genre genre){
        authorList = new ArrayList<>();
        genreList = new ArrayList<>();

        setTitle(title);
        this.authorList.add(author);
        addGenre(genre);
    }

    public void addAuthor(Author author){this.authorList.add(author);}

    public void addGenre(Genre genre){this.genreList.add(genre);}

    public void setId(long id){this.id = id;}

    public void setAuthorList(List<Author> authorList){this.authorList = authorList;}

    public void setGenreList(List<Genre> genreList){this.genreList = genreList;}

    public void setTitle(String title){this.title = title;}

    public long getId(){return id;}

    public List<Author> getAuthorList(){return authorList;}

    public List<Genre> getGenreList(){return genreList;}

    public String getTitle(){return title;}

    @Override
    public String toString(){
        return "Book " + title + "genre.....";
    }
}
