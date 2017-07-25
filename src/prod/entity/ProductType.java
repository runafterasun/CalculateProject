package prod.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 24.07.2017.
 */
@Entity
@Table(name = "ProductType")
public class ProductType extends Model{

    private static final long serialVersionUID = 3728464081932104226L;

    @OneToMany(mappedBy = "type")
    private Set<FoodLvThree> type = new HashSet<FoodLvThree>();

    @Column(name = "productName" ,length = 150)
    private String productName;

    public ProductType(){
        super();
    }
    public ProductType(Long id){
        super(id);
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
