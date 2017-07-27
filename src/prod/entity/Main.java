package prod.entity;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * Created by admin on 20.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<FirstLevelCat> flc = null;

        try {
            SQLQuery query = session.createSQLQuery("select * from FirstLevelCat");
            query.addEntity(FirstLevelCat.class);
            flc = query.list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.clear();
            sessionFactory.close();
        }

            for (Iterator iterator = flc.iterator(); iterator.hasNext();){
                FirstLevelCat levelCat = (FirstLevelCat) iterator.next();
                System.out.println(levelCat.toString());
            }


//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceConfig.class);
//
//        EntityManagerFactory entityManagerFactory = applicationContext.getBean(EntityManagerFactory.class);
//
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//        FirstLevelCat test = new FirstLevelCat();
//
////        FirstLevelCat test = new FirstLevelCat();
////        test.setName("test");
////        test.setPriority(1);
////
////        entityManager.persist(test);
//
//        transaction.commit();
//        entityManager.close();
    }
}
