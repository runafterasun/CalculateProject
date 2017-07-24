package prod.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 20.07.2017.
 */
@Entity
@Table(name = "FirstLevelCat")
public class FirstLevelCat {
    @Id
    @Column(name = "MainCatId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long MainCatId;

    @OneToMany(mappedBy = "commentId")
    private Set<CommentSecondLv> commentId = new HashSet<CommentSecondLv>();

    @OneToMany(mappedBy = "MainCatId")
    private Set<SecondLevelCat> secondLevelCat = new HashSet<SecondLevelCat>();

    @OneToMany(mappedBy = "levelFirstId")
    private Set<Prioritys> prioritys= new HashSet<Prioritys>();

    @Column(name = "name" ,length = 40)
    private String name;

    public Set<Prioritys> getPrioritys() {
        return prioritys;
    }

    public void setPrioritys(Set<Prioritys> prioritys) {
        this.prioritys = prioritys;
    }

    public long getMainCatId() {
        return MainCatId;
    }

    public void setMainCatId(long mainCatId) {
        MainCatId = mainCatId;
    }

    public Set<CommentSecondLv> getCommentId() {
        return commentId;
    }

    public void setCommentId(Set<CommentSecondLv> commentId) {
        this.commentId = commentId;
    }

    public Set<Prioritys> getPriorityd() {
        return prioritys;
    }

    public void setPriorityd(Set<Prioritys> priorityd) {
        this.prioritys = priorityd;
    }

    public Set<SecondLevelCat> getSecondLevelCat() {
        return secondLevelCat;
    }

    public void setSecondLevelCat(Set<SecondLevelCat> secondLevelCat) {
        this.secondLevelCat = secondLevelCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
