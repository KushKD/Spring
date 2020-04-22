package dao.repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
