package prod.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 24.07.2017.
 */
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @OneToMany(mappedBy = "userId")
    private Set<Prioritys> prioritys= new HashSet<Prioritys>();

    @Column(name = "nickname" ,length = 80)
    private String nickname;

    @Column(name = "lastLogin", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date lastLogin;

    @Column(name = "about" ,length = 80)
    private String about;

    @Column(name = "password" ,length = 25)
    private String password;



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Set<Prioritys> getPrioritys() {
        return prioritys;
    }

    public void setPrioritys(Set<Prioritys> prioritys) {
        this.prioritys = prioritys;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
