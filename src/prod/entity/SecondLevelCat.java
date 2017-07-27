package prod.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 20.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "SecondLevelCat")
public class SecondLevelCat extends Model{

    private static final long serialVersionUID = 7941499115311374576L;

    @ManyToOne
    @JoinColumn(name = "MainCatId", referencedColumnName = "id")
    private FirstLevelCat MainCatId;

    @OneToMany(mappedBy = "commentId")
    private Set<CommentSecondLv> priority = new HashSet<CommentSecondLv>();

    @OneToMany(mappedBy = "levelSecondId")
    private Set<Prioritys> prioritys= new HashSet<Prioritys>();

    @OneToMany(mappedBy = "categoryID")
    private Set<FoodLvThree> levelThree= new HashSet<FoodLvThree>();

    @Column(name = "name" ,length = 40)
    private String name;

    @Column(name = "lastUpdateData")
    private Date lastUpdateData;

}
