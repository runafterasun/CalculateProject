package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 24.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Users")
public class Users extends Model{

    private static final long serialVersionUID = -8904827508238518114L;

    @OneToMany(mappedBy = "userId")
    private Set<Prioritys> prioritys= new HashSet<Prioritys>();

    @Column(name = "nickname" ,length = 80)
    private String nickname;

    @Column(name = "lastLogin")
    private Date lastLogin;

    @Column(name = "about" ,length = 80)
    private String about;

    @Column(name = "password" ,length = 25)
    private String password;

    @OneToMany(mappedBy = "userId")
    private Set<Role> roleId= new HashSet<Role>();

}
