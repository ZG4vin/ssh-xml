package com.gavin.dao.impl;

import com.gavin.dao.ICustomerDao;
import com.gavin.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

/**
 * 客户的持久层实现类
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao {


	// hibernateTemplate，相当于hibernate中的session，对session进一步的封装，不用关心事务控制，以及关闭session
    @Override
    public List<Customer> findAllCustomer() {
        return (List<Customer>) getHibernateTemplate().find("from Customer");
    }

    @Override
    public void saveCustomer(Customer customer) {
        getHibernateTemplate().save(customer);
    }
}
