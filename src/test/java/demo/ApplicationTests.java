package demo;

import demo.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Slf4j
public class ApplicationTests {

    @Test
    public void doTest() throws ClassNotFoundException, SQLException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.hsqldb.jdbcDriver.class);
        dataSource.setUsername("sa");
        dataSource.setUrl("jdbc:hsqldb:db");
        dataSource.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        System.out.println("Creating tables");
        jdbcTemplate.execute("drop table customer if exists");
        jdbcTemplate.execute("create table customer(" +
                "id INTEGER, first_name varchar(255), last_name varchar(255))");

        List<Customer> results = jdbcTemplate.query(
                "select * from customer", new Object[] {},
                new RowMapper<Customer>() {
                    @Override
                    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Customer(rs.getLong("id"), rs.getString("first_name"));
                    }
                });

        for (Customer customer : results) {
            System.out.println(customer);
        }

    }

}
