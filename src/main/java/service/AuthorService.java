package service;

import model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import repository.dao.AuthorDAO;

/**
 * Created by oleks on 09.02.2017.
 */
public class AuthorService {
    private static SessionFactory sessionFactory = null;

    public AuthorService(){
        sessionFactory = HibernateService.getSessionfactory();
    }

    public Author getAuthor(long id){
        Session session =sessionFactory.openSession();
        AuthorDAO authorDAO = new AuthorDAO(session);
        session.close();
        return authorDAO.getAuthorById(id);
    }

    public void addAuthor(String firstName, String lastName, int age){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        AuthorDAO authorDAO = new AuthorDAO(session);
        authorDAO.addAuthor(firstName, lastName, age);
        transaction.commit();
        session.close();
    }
}
