package com.gavin.service.impl;

import com.gavin.dao.ICustomerDao;
import com.gavin.domain.Customer;
import com.gavin.service.ICustomerService;

import java.util.List;

/**
 * 客户的业务层实现类
 */
public class CustomerServiceImpl implements ICustomerService {


    private ICustomerDao customerDao;

    public void setCustomerDao(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }
}
