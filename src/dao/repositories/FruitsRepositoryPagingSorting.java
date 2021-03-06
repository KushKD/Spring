package dao.repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import entities.Fruits;
import java.lang.String;

@Repository
public interface FruitsRepositoryPagingSorting extends PagingAndSortingRepository<Fruits, Integer> {
	
	
	List<Fruits> findByFruitname(String fruitname); 
	List<Fruits> findByFruitnameAndFruitdesc(String fruitname, String fruitdesc ); 
	List<Fruits> findByFruitdescContains(String fruitdesc);
	 

}
