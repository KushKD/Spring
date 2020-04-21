package dao.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entities.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

	@Query(value= "from Student", nativeQuery=false)
	List<Student> findAllStudents();  
	//List<Student> findAllStudents(Pageable pageable);   if we want to add the Pagination and Sorting
	
	@Query("select st.firstName, st.lastName from Student st")
	List<Object[]> findAllPartialStudentsData();
	
	@Query("from Student where firstName=:firstName")
	List<Student> findAllStudentsByFirstName(@Param("firstName") String firstName);
}
