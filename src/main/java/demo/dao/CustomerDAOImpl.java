package demo.dao;

import com.google.common.base.Optional;
import demo.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wwadge on 24/10/2014.
 */
@Repository("customerDAO")
public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO{



    @Autowired
    public CustomerDAOImpl(SessionFactory sessionfactory){
        setSessionFactory(sessionfactory);
    }


    @Override
    public void save(Customer customer) {
        getHibernateTemplate().save(customer);
    }

    @Override
    public Optional<Customer> findByName(String name) {
        List list = getHibernateTemplate().find(
                "from demo.model.Customer c"
        );
        return list.isEmpty() ? Optional.absent() : Optional.of((Customer) list.get(0));
    }
}


