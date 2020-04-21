package dao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entities.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

	@Query("from Student")
	List<Student> findAllStudents();
	
	@Query("select st.firstName, st.lastName from Student st")
	List<Object[]> findAllPartialStudentsData();
	
	@Query("from Student where firstName=:firstName")
	List<Student> findAllStudentsByFirstName(@Param("firstName") String firstName);
}
