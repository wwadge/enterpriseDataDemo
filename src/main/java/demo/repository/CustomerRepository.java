package demo.repository;

import demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wwadge on 16/10/2014.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
