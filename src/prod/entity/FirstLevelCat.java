package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 20.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "FirstLevelCat")
public class FirstLevelCat extends Model{

    private static final long serialVersionUID = 4113653911261923464L;

    @OneToMany(mappedBy = "commentId")
    private Set<CommentSecondLv> commentId = new HashSet<CommentSecondLv>();

    @OneToMany(mappedBy = "MainCatId")
    private Set<SecondLevelCat> secondLevelCat = new HashSet<SecondLevelCat>();

    @OneToMany(mappedBy = "levelFirstId")
    private Set<Prioritys> prioritys= new HashSet<Prioritys>();

    @Column(name = "name" ,length = 40)
    private String name;

    public String toString(){
        return super.getId() + " " + name;
    }
}
