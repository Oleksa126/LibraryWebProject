package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import repository.dao.GenreDAO;

/**
 * Created by oleks on 09.02.2017.
 */
public class GenreService {
    private SessionFactory sessionFactory = null;

    public GenreService(){
        sessionFactory = HibernateService.getSessionfactory();
    }

    public void addGenre(String genre){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        GenreDAO genreDAO = new GenreDAO(session);
        genreDAO.addGenre(genre);
        transaction.commit();
        session.close();
    }
}
