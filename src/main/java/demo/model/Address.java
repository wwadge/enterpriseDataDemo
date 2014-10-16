package demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by wwadge on 16/10/2014.
 */
@Entity
@Getter
@Setter
@ToString
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Customer customer;
    private String line1;

}
