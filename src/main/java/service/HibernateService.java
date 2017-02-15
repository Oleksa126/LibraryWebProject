package service;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * Created by oleks on 09.02.2017.
 */
public class HibernateService {

    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        sessionFactory = cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionfactory() {
        return sessionFactory;
    }

}
