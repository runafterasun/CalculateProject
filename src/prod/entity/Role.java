package prod.entity;

import javax.persistence.*;

/**
 * Created by admin on 25.07.2017.
 */
@Entity
@Table(name = "Role")
public class Role extends Model{

    private static final long serialVersionUID = -7093656700523495999L;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private Users userId;

    @Column(name = "role" ,length = 50)
    private String role;

    public Role(){
        super();
    }
    public Role(Long id){
        super(id);
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
