package prod.DAO;

import prod.entity.Users;

import java.util.List;

/**
 * Created by admin on 15.08.2017.
 */
public interface UserDAO {
    List list();

    Users get(int id);

    void seveOrUpdate(Users users);

    void delete(int id);
}
