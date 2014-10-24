package demo.repository;

import demo.model.Address;
import demo.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 * Created by wwadge on 24/10/14.
 */
@RepositoryEventHandler
@Slf4j
@Component
public class CustomerEventHandler {

    @HandleBeforeCreate(Customer.class) public void handlePersonSave(Customer c) {
        log.error("About to save " + c);
    }

    @HandleAfterDelete(Address.class) public void handleProfileSave(Address a) {
    }
}