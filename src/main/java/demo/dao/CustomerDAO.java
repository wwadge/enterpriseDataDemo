package demo.dao;

import com.google.common.base.Optional;
import demo.model.Customer;

/**
 * Created by wwadge on 24/10/2014.
 */
public interface CustomerDAO {

    void save(Customer customer);
    Optional<Customer> findByName(String name);
}
