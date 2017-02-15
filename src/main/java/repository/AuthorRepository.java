package repository;

import model.Author;

/**
 * Created by oleks on 09.02.2017.
 */
public interface AuthorRepository {
    public boolean addAuthor(String firstName, String lastName, int age);

    public boolean editAuthor();
    public void allAuthorBooksById(long id);
    public Author getAuthorById(long id);
}
