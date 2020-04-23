package dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Programmer;

@Repository
public interface ProjectsProgrammersRepository extends CrudRepository<Programmer, Integer> {

}
