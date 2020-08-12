package br.com.detroit.order.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.detroit.order.models.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {

}
