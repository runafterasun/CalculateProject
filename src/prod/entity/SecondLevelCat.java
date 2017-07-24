package prod.entity;



import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 20.07.2017.
 */
@Entity
@Table(name = "SecondLevelCat")
public class SecondLevelCat {
    @Id
    @Column(name = "categoryID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryID;

    @ManyToOne
    @JoinColumn(name = "MainCatId")
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



    public Set<Prioritys> getPrioritys() {
        return prioritys;
    }

    public void setPrioritys(Set<Prioritys> prioritys) {
        this.prioritys = prioritys;
    }

    public long getCategoryID() {
        return categoryID;
    }

    public FirstLevelCat getMainCatId() {
        return MainCatId;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdateData() {
        return lastUpdateData;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public void setMainCatId(FirstLevelCat mainCatId) {
        MainCatId = mainCatId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdateData(Date lastUpdateData) {
        this.lastUpdateData = lastUpdateData;
    }

    public Set<CommentSecondLv> getPriority() {
        return priority;
    }

    public void setPriority(Set<CommentSecondLv> priority) {
        this.priority = priority;
    }

    public Set<FoodLvThree> getLevelThree() {
        return levelThree;
    }

    public void setLevelThree(Set<FoodLvThree> levelThree) {
        this.levelThree = levelThree;
    }
}
