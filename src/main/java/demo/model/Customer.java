package demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany
    @JoinColumn(name = "customer_id")
    private Set<Address> address = new HashSet<Address>();

}
