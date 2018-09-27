package com.gavin.web.action;

import com.gavin.domain.Customer;
import com.gavin.service.ICustomerService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * 客户的动作类
 */
public class CustomerAction extends ActionSupport {

    private List<Customer> customers;

    private ICustomerService customerService;

    public void setCustomerService(ICustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * 添加客户页面
     * @return
     */
    public String addUICustomer(){
        return "addUICustomer";
    }

    /**
     * 查询所有客户
     * @return
     */
    public String findAllCustomer(){
        customers=customerService.findAllCustomer();
        return "findAllCustomer";
    }

















    //-----getter/setter--------
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}