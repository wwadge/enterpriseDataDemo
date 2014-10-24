package demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wwadge on 16/10/2014.
 */
@Entity
@Getter @Setter @ToString
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;


}
