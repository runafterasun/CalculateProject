package prod.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 25.07.2017.
 */
@MappedSuperclass
public abstract class Model implements Serializable{

    private static final long serialVersionUID = 7868359774818570199L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Model(){}

    public Model(Long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
