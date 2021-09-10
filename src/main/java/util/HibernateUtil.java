package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static{
//        try{
            Configuration cfg=new Configuration().configure("hibernate.cfg.xml");


            sessionFactory=cfg.buildSessionFactory();
//        }
//
//        catch(HibernateException exception){
//            System.out.println("Problem creating session factory");
//        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }

}
