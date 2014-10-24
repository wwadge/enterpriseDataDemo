package demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by wwadge on 16/10/2014.
 */
@Getter @Setter @AllArgsConstructor
@Table(name="customer") @Entity
public class Customer {

    @GeneratedValue
    @Id
    private Long id;
    @Column
    private String name;


}
