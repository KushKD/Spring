package dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.ImageData;

@Repository
public interface ImageRepository extends CrudRepository<ImageData, Integer> {

}
