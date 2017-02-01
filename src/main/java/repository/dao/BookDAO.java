package repository.dao;

import model.Book;
import model.User;
import repository.BookRepository;

/**
 * Created by oleks on 29.01.2017.
 */
public class BookDAO implements BookRepository {


    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Book getByGenre() {
        return null;
    }

    @Override
    public Book getByAuthor() {
        return null;
    }
}
