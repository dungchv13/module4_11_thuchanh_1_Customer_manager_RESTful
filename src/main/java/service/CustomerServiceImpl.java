package service;

import entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CustomerRepository;

import javax.xml.ws.Action;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }
}
