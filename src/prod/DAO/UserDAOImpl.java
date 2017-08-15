package prod.DAO;

import lombok.NoArgsConstructor;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import prod.entity.Users;

import java.util.List;

/**
 * Created by admin on 15.08.2017.
 */
@NoArgsConstructor
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List list() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Users.class)
                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY)
                .list();
    }
    @Transactional
    public Users get(int id) {
        String hql = "from Users where id="+id;
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List listUser = query.list();
        if (listUser != null && !listUser.isEmpty()){
            return (Users)listUser.get(0);
        }
        return null;
    }
    @Transactional
    public void seveOrUpdate(Users users) {
        sessionFactory.getCurrentSession().saveOrUpdate(users);
    }

    public void delete(int id) {
        Users usersToDelete = new Users();
        usersToDelete.setId(id);
        sessionFactory.getCurrentSession().delete(usersToDelete);
    }
}
