package prod.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 24.07.2017.
 */
@Entity
@Table(name = "ProductType")
public class ProductType {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "type")
    private Set<FoodLvThree> type = new HashSet<FoodLvThree>();

    @Column(name = "productName" ,length = 150)
    private String productName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<FoodLvThree> getType() {
        return type;
    }

    public void setType(Set<FoodLvThree> type) {
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
