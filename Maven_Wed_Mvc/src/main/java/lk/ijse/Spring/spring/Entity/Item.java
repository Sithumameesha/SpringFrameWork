package lk.ijse.Spring.spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private  double unitPrice;

}
