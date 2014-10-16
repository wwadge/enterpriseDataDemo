package demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Slf4j
public class ApplicationTests {

    @Test
    public void doTest() throws ClassNotFoundException, SQLException {
        // Load the HSQL Database Engine JDBC driver
        // hsqldb.jar should be in the class path or made part of the current jar
        Class.forName("org.hsqldb.jdbcDriver");

        // connect to the database.
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:db",
                "sa",                     // username
                "");                      // password

        Statement st = null;

        st = conn.createStatement();    // statements
        int i = st.executeUpdate("CREATE TABLE customer ( id INTEGER IDENTITY, name VARCHAR(256))");    // run the query

        if (i == -1) {
            System.out.println("db error");
        }


        ResultSet rs = st.executeQuery("Select * from customer");    // run the query
        while(rs.next()){
            System.out.println(rs.getString("id"));
        }
        rs.close();
        st.close();

    }

}
