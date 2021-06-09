package com.place.store.Consumer;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity  
@Table(name = "Customer") 
public class Customer{

  @Id
  @SequenceGenerator(
    name = "customer_info",
    sequenceName = "customer_info"
  )
  @GeneratedValue(
    strategy =  GenerationType.SEQUENCE,
    generator = "customer_info"
  )

 
  private Long CustomerID;
  private String firstName;
  private String lastName;
  private String Address;
  private LocalDate dob;
  private String Country;

  public Customer(){}

  public Customer(Long CustomerID,  String firstName, String lastName, String Address, LocalDate dob,String Country)
  {
    this.CustomerID = CustomerID ;
    this.firstName = firstName;
    this.lastName = lastName;
    this.Address = Address;
    this.dob = dob;
    this.Country = Country;
  }

  public Customer(String firstName, String lastName, String Address,LocalDate dob, String Country)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.Address = Address;
    this.dob = dob;
    this.Country = Country;
  }

  public Long getCustomerID(){
    return CustomerID;
  }

  public void setCustomerID(Long CustomerID){
    this.CustomerID = CustomerID;
  }

 
  public String getfirstName(){
    return firstName;
  }

  public void setfirstName(String firstName){
    this.firstName = firstName;
  }

  public String getlastName(){
    return lastName;
  }

  public void setlastName(String lastName){
    this.lastName = lastName;
  }

  public String getAddress(){
    return Address;
  }

  public void setAddress(String Address){
    this.Address = Address;
  }

  public LocalDate getDob(){
    return dob;
  }

  public void setDob(LocalDate dob){
    this.dob = dob;
  }

  public String getCountry(){
    return Country;
  }

  public void setCountry(String Country){
    this.Country = Country;
  }

  @Override 
  public String toString(){
    return "Customer{" + 
    "CustomerID='" + CustomerID + "\'"+
    ", firstName='" + firstName + "\'"+
    ", lastName='" + lastName +
    ", Address='" + Address + 
    ", dob='" + dob + 
    ", Country='" + Country +
    '}';
  }
  
}