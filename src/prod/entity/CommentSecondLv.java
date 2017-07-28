package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CommentSecondLv")
public class CommentSecondLv extends Model{

    private static final long serialVersionUID = 1632930370350850501L;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="commentId", referencedColumnName = "id")
    private FirstLevelCat commentId;

    @CreationTimestamp
    @Column(name = "CommentDate")
    private Date CommentDate;

    @Column(name = "Comments" ,length = 500)
    private String Comments;

    @Column(name = "FavoriteFlag")
    private int FavoriteFlag;

}
