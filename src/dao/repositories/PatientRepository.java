package dao.repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Patients;

public interface PatientRepository extends CrudRepository<Patients, Integer> {

}
