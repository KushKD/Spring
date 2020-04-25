package dao.repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Doctors;

public interface DoctorRepository extends CrudRepository<Doctors, Integer> {

}
