package com.example.demo;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Person;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.CustomerService;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @Mock
    CustomerRepository repository;
   // @Mock
   // PersonRepository personRepository;

    @InjectMocks
    CustomerService service;

    @Test
    public void testGetCustomerById(){
        int input =1;

        Customer expectedResponse = new Customer();
        expectedResponse.setCustomerid(1);
        expectedResponse.setAccountnumber("MOCK");
        expectedResponse.setStoreid(1);
        expectedResponse.setTerritoryid(1);
        //Person  expectedPerson = new Person();

        when(repository.getReferenceById(input)).thenReturn(expectedResponse);
        //when(personRepository.getReferenceById(input)).thenReturn(expectedPerson);

        Customer actualResponse = service.getCustomerById(input);

        assertEquals(expectedResponse.getCustomerid(), actualResponse.getCustomerid());
    }

    @Test(expected = NullPointerException.class)
    public void testGetCustomerById_thenThrowNullPointerException(){
        int input =1;

        when(repository.getReferenceById(input)).thenThrow(NullPointerException.class);
        service.getCustomerById(input);
    }

}
