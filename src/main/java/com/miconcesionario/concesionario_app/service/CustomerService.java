package com.miconcesionario.concesionario_app.service;

import com.miconcesionario.concesionario_app.model.Customer;
import com.miconcesionario.concesionario_app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer>ListarClientes(){
        return customerRepository.findAll();
    }

    public Customer guardarCliente(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer buscarPorId(Long id){
        return customerRepository.findById(id).orElse(null);
    }
    public void eliminarCliente(Long id){
        customerRepository.deleteById(id);
    }
}
