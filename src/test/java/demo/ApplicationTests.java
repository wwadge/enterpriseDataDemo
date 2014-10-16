package demo;

import demo.model.Customer;
import demo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Slf4j
public class ApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    @Transactional
	public void doTest() {
        Customer customer = new Customer();
        customer.setName("Foo");
        Customer c2 = customerRepository.save(customer);
        for (Customer c : customerRepository.findAll()){
            log.info(c.getName());
        }

        Customer c = customerRepository.findByName("Foo");
        log.info(c.getName());


    }

}
