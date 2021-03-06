package dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	

}
