package com.talentyco.springboot.models.repositories;

import com.talentyco.springboot.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaRepository extends CrudRepository<Factura, Long> {
}
