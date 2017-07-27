package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by admin on 25.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Role")
public class Role extends Model{

    private static final long serialVersionUID = -7093656700523495999L;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private Users userId;

    @Column(name = "role" ,length = 50)
    private String role;

}
