package org.thehecklers.pcfbasicdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by markheckler on 5/24/17.
 */
@Entity
@Data
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Product(String name) {
        this.name = name;
    }
}
