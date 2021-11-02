package com.talentyco.springboot.models.repositories;


import com.talentyco.springboot.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteRepository extends PagingAndSortingRepository<Cliente, Long> {


}