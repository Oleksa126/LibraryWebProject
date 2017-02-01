package repository.dao;

import model.User;
import org.hibernate.Criteria;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import repository.UserRepository;

import javax.jws.soap.SOAPBinding;

/**
 * Created by oleks on 30.01.2017.
 */
public class UsersDAO implements UserRepository{

    private Session session;

    public UsersDAO(Session session) {this.session = session;}

    @Override
    public long insertUser(String firstName, String lastName, int age)throws HibernateException {
        return (Long)session.save(new User(firstName, lastName, age));
    }

    @Override
    public User getById(long id) throws HibernateException {
        return (User) session.get(User.class, id);
    }

    @Override
    public User getByName (String name) throws HibernateException {
        Criteria criteria = session.createCriteria(User.class);
        return (User) criteria.add(Restrictions.eq("name", name)).uniqueResult();
    }
}
