package com.adda.app.reposatraty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adda.app.Bean.Employee;
@Repository
public interface EmpRepos extends JpaRepository<Employee, Integer> {
 @Query("select e from Employee e WHERE e.emapname LIKE %?1%" 
		 +" OR e.empsal LIKE %?1%"
		 +" OR e.empdept LIKE %?1%"
		 +" OR CONCAT(e.empsal, '')LIKE %?1%"
		 )
	public List<Employee>Search(String keyword);
}
