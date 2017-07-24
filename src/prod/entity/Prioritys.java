package prod.entity;

import javax.persistence.*;

/**
 * Created by admin on 24.07.2017.
 */
@Entity
@Table(name = "Prioritys")
public class Prioritys {
    @Id
    @Column(name = "priorityId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long priorityId;

    @ManyToOne
    @JoinColumn(name="levelFirstId")
    private FirstLevelCat levelFirstId;

    @ManyToOne
    @JoinColumn(name="levelSecondId")
    private SecondLevelCat levelSecondId;

    @ManyToOne
    @JoinColumn(name="userId")
    private Users userId;

    @Column(name = "priority")
    private int priority;

    public long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(long priorityId) {
        this.priorityId = priorityId;
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
