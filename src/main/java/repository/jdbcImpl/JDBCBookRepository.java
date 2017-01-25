package repository.jdbcImpl;

import model.Book;
import model.User;
import repository.BookRepository;

/**
 * Created by oleks on 25.01.2017.
 */
public class JDBCBookRepository implements BookRepository {
    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public void searchByGenre() {

    }

    @Override
    public void searchByAuthor() {

    }
}
