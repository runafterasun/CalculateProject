package prod.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 25.07.2017.
 */
@Data
@AllArgsConstructor
@MappedSuperclass
public abstract class Model implements Serializable{

    private static final long serialVersionUID = 7868359774818570199L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
