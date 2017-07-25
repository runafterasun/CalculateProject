package prod.entity;

import org.springframework.security.access.method.P;

import javax.persistence.*;

/**
 * Created by admin on 24.07.2017.
 */
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

    public Prioritys(){
        super();
    }
    public Prioritys(Long id){
        super(id);
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public FirstLevelCat getLevelFirstId() {
        return levelFirstId;
    }

    public void setLevelFirstId(FirstLevelCat levelFirstId) {
        this.levelFirstId = levelFirstId;
    }

    public SecondLevelCat getLevelSecondId() {
        return levelSecondId;
    }

    public void setLevelSecondId(SecondLevelCat levelSecondId) {
        this.levelSecondId = levelSecondId;
    }
}
