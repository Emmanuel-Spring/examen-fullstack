package com.talentyco.springboot.models.repositories;


import com.talentyco.springboot.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

}