package com.talentyco.springboot.models.repositories;

import com.talentyco.springboot.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends CrudRepository<Factura, Long> {
}
