package prod.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 24.07.2017.
 */
@Entity
@Table(name = "FoodLvThree")
public class FoodLvThree {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="categoryID")
    private SecondLevelCat categoryID;

    @ManyToOne
    @JoinColumn(name="userId")
    private Users userId;

    @Column(name = "productPrice")
    private Double productPrice;

    @Column(name = "insertData", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date insertData;

    @Column(name = "lastUpdateData", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date lastUpdateData;

    @Column(name = "quantityOfGoods")
    private int quantityOfGoods;

    @Column(name = "comments" ,length = 150)
    private String comments;

    @ManyToOne
    @JoinColumn(name="type")
    private ProductType type;

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
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
