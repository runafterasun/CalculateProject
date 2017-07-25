package prod.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 24.07.2017.
 */
@Entity
@Table(name = "FoodLvThree")
public class FoodLvThree extends Model{

    private static final long serialVersionUID = -446254898284261126L;

    @ManyToOne
    @JoinColumn(name="categoryID", referencedColumnName = "id")
    private SecondLevelCat categoryID;

    @ManyToOne
    @JoinColumn(name="userId", referencedColumnName = "id")
    private Users userId;

    @Column(name = "productPrice")
    private BigDecimal productPrice;

    @Column(name = "insertData")
    private Date insertData;

    @Column(name = "lastUpdateData")
    private Date lastUpdateData;

    @Column(name = "quantityOfGoods")
    private int quantityOfGoods;

    @Column(name = "comments" ,length = 150)
    private String comments;

    @ManyToOne
    @JoinColumn(name="type", referencedColumnName = "id")
    private ProductType type;

    public FoodLvThree(){
        super();
    }
    public FoodLvThree(Long id){
        super(id);
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public SecondLevelCat getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(SecondLevelCat categoryID) {
        this.categoryID = categoryID;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Date getInsertData() {
        return insertData;
    }

    public void setInsertData(Date insertData) {
        this.insertData = insertData;
    }

    public Date getLastUpdateData() {
        return lastUpdateData;
    }

    public void setLastUpdateData(Date lastUpdateData) {
        this.lastUpdateData = lastUpdateData;
    }

    public int getQuantityOfGoods() {
        return quantityOfGoods;
    }

    public void setQuantityOfGoods(int quantityOfGoods) {
        this.quantityOfGoods = quantityOfGoods;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
