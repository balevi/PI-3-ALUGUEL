package br.fvc.pi3.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Silas Souza
 */
public class HibernateUtil {

      private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            
            configuration.configure();
            
            ServiceRegistry serviceRegistry = 
            		new ServiceRegistryBuilder()
            			.applySettings(configuration.getProperties())
            			.buildServiceRegistry();
            
            sessionFactory = configuration
            				.buildSessionFactory(serviceRegistry);            
            
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
