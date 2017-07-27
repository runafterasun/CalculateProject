package prod.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 24.07.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ProductType")
public class ProductType extends Model{

    private static final long serialVersionUID = 3728464081932104226L;

    @OneToMany(mappedBy = "type")
    private Set<FoodLvThree> type = new HashSet<FoodLvThree>();

    @Column(name = "productName" ,length = 150)
    private String productName;

}
