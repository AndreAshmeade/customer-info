package com.place.store.Consumer;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class CustomerConfig {

  @Bean
  CommandLineRunner commandLineRunner(CustomerRepository repository)
  {
    return args -> {
      Customer kevin = new Customer(
        "kevin",
        "Lee",
        "324 soth 23rd Street",
        LocalDate.of(2001,Month.APRIL,7),
        "America"
        );
      
        Customer glenn = new Customer(
          "Glenn",
          "Gold",
          "309 west 21 steet",
          LocalDate.of(1980,Month.AUGUST,9),
          "Japan"
        );

    repository.saveAll(List.of(kevin,glenn));

  };
 }
}
