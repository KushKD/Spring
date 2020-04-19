package dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entities.Products;


@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {

}
