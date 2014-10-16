package demo.repository;

import demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

/**
 * Created by wwadge on 16/10/2014.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(value = "SELECT * FROM whatever_custom_query here s WHERE s.reconciliation_setting_id=?1", nativeQuery = true)
    Address doAFoo(String s);
}

