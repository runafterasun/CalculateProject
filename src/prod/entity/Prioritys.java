package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by admin on 24.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Prioritys")
public class Prioritys extends Model{

    private static final long serialVersionUID = 2260239684284469513L;

    @ManyToOne
    @JoinColumn(name="levelFirstId", referencedColumnName = "id")
    private FirstLevelCat levelFirstId;

    @ManyToOne
    @JoinColumn(name="levelSecondId", referencedColumnName = "id")
    private SecondLevelCat levelSecondId;

    @ManyToOne
    @JoinColumn(name="userId", referencedColumnName = "id")
    private Users userId;

    @Column(name = "priority")
    private int priority;

}
