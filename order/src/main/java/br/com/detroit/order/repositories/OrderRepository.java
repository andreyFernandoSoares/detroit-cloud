package br.com.detroit.order.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.detroit.order.models.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
