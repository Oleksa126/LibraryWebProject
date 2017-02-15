package repository;

import model.Genre;

/**
 * Created by oleks on 09.02.2017.
 */
public interface GenreRepository {

    public boolean addGenre(String genre);

    public void allBooksByGenre(String genre);
}
