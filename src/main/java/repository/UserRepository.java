package repository;

import model.User;
import org.hibernate.HibernateException;

/**
 * Created by oleks on 27.01.2017.
 */
public interface UserRepository {

    User getById (long id)throws HibernateException;
    User getByName(String name)throws HibernateException;
    long insertUser(String firstName, String lastName, int age)throws HibernateException;

}
