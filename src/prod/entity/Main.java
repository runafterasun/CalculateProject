package prod.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import prod.config.AppConfig;
import prod.config.PersistenceConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Locale;

/**
 * Created by admin on 20.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                PersistenceConfig.class);
        EntityManagerFactory entityManagerFactory = applicationContext
                .getBean(EntityManagerFactory.class);
        EntityManager entityManager = entityManagerFactory
                .createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        FirstLevelCat test = new FirstLevelCat();
//        test.setName("test");
//        test.setPriority(1);
//
//        entityManager.persist(test);

        transaction.commit();
        entityManager.close();
    }
}
