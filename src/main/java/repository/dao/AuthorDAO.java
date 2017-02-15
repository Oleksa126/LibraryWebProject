package repository.dao;

import model.Author;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import repository.AuthorRepository;

/**
 * Created by oleks on 09.02.2017.
 */
public class AuthorDAO implements AuthorRepository {
    private Session session;

    public AuthorDAO(Session session){this.session = session;}

    @Override
    public boolean addAuthor(String firstName, String lastName, int age)throws HibernateException {
        session.save(new Author(firstName, lastName, age));
        return true;
    }

    @Override
    public boolean editAuthor() {
        return false;
    }

    @Override
    public void allAuthorBooksById(long id) {

    }

    @Override
    public Author getAuthorById(long id) throws HibernateException {
        return (Author)session.get(Author.class, id);
    }
}
