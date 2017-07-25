package prod.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CommentSecondLv")
public class CommentSecondLv extends Model{

    private static final long serialVersionUID = 1632930370350850501L;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="commentId", referencedColumnName = "id")
    private FirstLevelCat commentId;

    @Column(name = "CommentDate")
    private Date CommentDate;

    @Column(name = "Comments" ,length = 500)
    private String Comments;

    @Column(name = "FavoriteFlag")
    private int FavoriteFlag;

    public CommentSecondLv(){
        super();
    }
    public CommentSecondLv(Long id){
        super(id);
    }

    public FirstLevelCat getCommentId() {
        return commentId;
    }

    public void setCommentId(FirstLevelCat commentId) {
        this.commentId = commentId;
    }

    public Date getCommentDate() {
        return CommentDate;
    }

    public void setCommentDate(Date commentDate) {
        CommentDate = commentDate;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public int getFavoriteFlag() {
        return FavoriteFlag;
    }

    public void setFavoriteFlag(int favoriteFlag) {
        FavoriteFlag = favoriteFlag;
    }
}
