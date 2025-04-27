package com.miconcesionario.concesionario_app.controller;


import com.miconcesionario.concesionario_app.model.Customer;
import com.miconcesionario.concesionario_app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> Listar(){
        return customerService.ListarClientes();
    }
    @PostMapping
    public Customer guardar(@RequestBody Customer customer){
        return customerService.guardarCliente(customer);
    }
    @GetMapping("/{id}")
    public Customer buscar(@PathVariable Long id){
        return customerService.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        customerService.eliminarCliente(id);
    }
    @PutMapping("/{id}")
    public Customer actualizar(@PathVariable Long id, @RequestBody Customer customerActualizado) {
        Customer clienteExistente = customerService.buscarPorId(id);

        if (clienteExistente != null) {
            clienteExistente.setFullname(customerActualizado.getFullname());
            clienteExistente.setEmail(customerActualizado.getEmail());
            clienteExistente.setPassword(customerActualizado.getPassword());
            return customerService.guardarCliente(clienteExistente);
        } else {
            return null;
        }
    }
}
