package service;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;
import repository.dao.UsersDAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by oleks on 30.01.2017.
 */
public class UserService {

    private static SessionFactory sessionFactory = null;

    public UserService() {
//        Configuration configuration = getMySqlConfiguration();
//        sessionFactory = createSessionFactory(configuration);
        sessionFactory = HibernateService.getSessionfactory();

    }

    @SuppressWarnings("UnusedDeclaration")
//    private Configuration getMySqlConfiguration() {
//        Configuration configuration = new Configuration();
//        configuration.addAnnotatedClass(User.class);
//
//        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
//        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/bookrepository");
//        configuration.setProperty("hibernate.connection.username", "root");
//        configuration.setProperty("hibernate.connection.password", "root");
//        configuration.setProperty("hibernate.show_sql", hibernate_show_sql);
//        configuration.setProperty("hibernate.hbm2ddl.auto", hibernate_hbm2ddl_auto);
//        return configuration;
//    }

//    private static SessionFactory createSessionFactory(Configuration configuration) {
//        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
//        builder.applySettings(configuration.getProperties());
//        ServiceRegistry serviceRegistry = builder.build();
//        return configuration.buildSessionFactory(serviceRegistry);
//    }

    public User getUser(long id) {
        Session session = sessionFactory.openSession();
        UsersDAO dao = new UsersDAO(session);
        User dataSet = dao.getById(id);
        session.close();
        return dataSet;
    }

    public long addUser(String firstName, String lastName, int age) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UsersDAO dao = new UsersDAO(session);
        long id = dao.insertUser(firstName, lastName, age);
        transaction.commit();
        session.close();
        return id;
    }

    public void printConnectInfo() {
        try {
            SessionFactoryImpl sessionFactoryImpl = (SessionFactoryImpl) sessionFactory;
            Connection connection = sessionFactoryImpl.getConnectionProvider().getConnection();
            System.out.println("DB name: " + connection.getMetaData().getDatabaseProductName());
            System.out.println("DB version: " + connection.getMetaData().getDatabaseProductVersion());
            System.out.println("Driver: " + connection.getMetaData().getDriverName());
            System.out.println("Autocommit: " + connection.getAutoCommit());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
