package demo.repository.custom.impl;

import demo.model.Address;
import demo.model.QAddress;
import demo.repository.custom.AddressRepositoryCustom;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

/**
 * Created by wwadge on 16/10/2014.
 */
public class AddressRepositoryImpl extends QueryDslRepositorySupport implements AddressRepositoryCustom {


    /**
     * Creates a new {@link org.springframework.data.jpa.repository.support.QueryDslRepositorySupport} instance for the given domain type.
     *
     */
    public AddressRepositoryImpl() {
        super(QAddress.class);
    }

    @Override
    public Address doAFunkThink(String s) {
        return  from(QAddress.address)
                .where(QAddress.address.line1.eq(s))
                .singleResult(QAddress.address);
    }
}
