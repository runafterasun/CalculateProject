package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 24.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
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

}
