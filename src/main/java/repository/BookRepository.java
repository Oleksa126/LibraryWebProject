package repository;

import model.Book;
import model.User;

/**
 * Created by oleks on 25.01.2017.
 */
public interface BookRepository {
    boolean addBook(Book book);
    boolean addUser(User user);

    void searchByGenre();
    void searchByAuthor();
}
