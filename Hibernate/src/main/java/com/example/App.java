package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Programmer p1 = new Programmer();

        p1.setId(104);
        p1.setName("GHI");
        p1.setTech("DL");

        // Configuration config = new Configuration();
        // config.addAnnotatedClass(com.example.Programmer.class);
        // config.configure("hibernate.cfg.xml");

        // SessionFactory factory = config.buildSessionFactory();

        SessionFactory factory = new Configuration()
                            .addAnnotatedClass(com.example.Programmer.class)
                            .configure()
                            .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // session.persist(p1);
        // session.merge(p1);
        // Programmer z = session.find(Programmer.class, 104);
        // session.remove(z);
        session.persist(p1);

        transaction.commit();

        // Programmer z = session.find(Programmer.class, 103);     eager fetching

        // System.out.println(z);

        session.close();
        factory.close();
    }
}
