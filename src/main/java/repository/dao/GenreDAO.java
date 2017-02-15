package repository.dao;

import model.Genre;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repository.GenreRepository;

import javax.persistence.GeneratedValue;

/**
 * Created by oleks on 09.02.2017.
 */
public class GenreDAO implements GenreRepository {
    private Session session = null;

    public GenreDAO(Session session){this.session = session;}

    @Override
    public boolean addGenre(String genre) throws HibernateException{
        session.save(new Genre(genre));
        return true;
    }

    @Override
    public void allBooksByGenre(String genre) throws HibernateException{

    }
}
