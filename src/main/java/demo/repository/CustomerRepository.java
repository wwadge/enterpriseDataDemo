package demo.repository;

import demo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by wwadge on 16/10/2014.
 */
@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByName(@Param("name") String name);
}
