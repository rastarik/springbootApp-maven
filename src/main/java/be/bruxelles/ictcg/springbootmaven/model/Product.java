package be.bruxelles.ictcg.springbootmaven.model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name="PRODUCTS")
public class Product implements Serializable {

    @Id @GeneratedValue
    private Long reference;
    private String code;
    private double price;
    private int quantity;
    private String description;
}
