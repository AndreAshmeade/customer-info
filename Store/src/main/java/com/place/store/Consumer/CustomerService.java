package com.place.store.Consumer;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;

import javax.transaction.Transactional;

@Service
public class CustomerService {

  public final CustomerRepository customerRepository;

  @Autowired
  public CustomerService(CustomerRepository customerRepository){
    this.customerRepository = customerRepository;
  }

  @GetMapping
  public List<Customer> getCustomers(){
  return customerRepository.findAll();
  }

  public void addNewCustomer(Customer customer){
  Optional<Customer> FirstName = customerRepository.findByFirstName(customer.getfirstName());
  Optional<Customer> LastName = customerRepository.findByLastName(customer.getlastName());
  if(FirstName.isPresent() && LastName.isPresent() ){
    throw new IllegalStateException("Identity Taken");
  }
  customerRepository.save(customer);
  }

  public void deleteCustomer(Long customerId){
    boolean exists = customerRepository.existsById(customerId);
    if(!exists){
      throw new IllegalStateException(
        "customer with id" + customerId + "does not exits");
    }
    customerRepository.deleteById(customerId);
   }

  
  @Transactional
  public void updateCustomer(Long customerId, String firstName, String lastName){
    Customer customer = customerRepository.findById(customerId).orElseThrow(() ->
    new IllegalStateException("customer with id " + customerId + " does not exists"));
    if(firstName != null && firstName.length() > 0 && !Objects.equals(customer.getfirstName(), firstName)){
			Optional<Customer> customerOptional = customerRepository.findByFirstName(firstName);
			if(customerOptional.isPresent()){
				throw new IllegalStateException("firstname taken");
			}
      customer.setfirstName(firstName);
 }
 if(lastName != null && lastName.length() > 0 && !Objects.equals(customer.getlastName(), lastName)){
  Optional<Customer> customerOptional = customerRepository.findByLastName(lastName);
  if(customerOptional.isPresent()){
    throw new IllegalStateException("lastname taken");
  }
  customer.setlastName(lastName);

 }
}

}
  




