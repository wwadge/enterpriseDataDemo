package demo;

import demo.dao.CustomerDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@ContextConfiguration(locations = { "/custom.xml" } )
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class ApplicationTests {

    @Autowired
    CustomerDAO dao;

    @Test
    @Transactional
    public void doTest() throws ClassNotFoundException, SQLException {
        dao.findByName("Foo");
    }

}
