package com.adda.app.EmpRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Bean.Employee;

public interface EployeeRepo extends JpaRepository<Employee, Integer> {
/*  //1.fetch single column data
	@Query("Select e.eName From Employee e")
	List<String>getAllEmpNames();
	
	//2.fetch all column
	@Query("Select e from Employee e")
	List<Employee>getAllEmps();
	
	//3.fetch some column
	@Query("Select e.eId,e.eName From Employee e")
	List<Object[]>fetchIdAndName();
	
	//4. Single Object
	@Query("SELECT e.eId,e.eName From Employee e where e.eId=:id")
	Optional<String>getEmpNameById(Integer id);*/
	
	//5.
	@Query("Select e from Employee where eId=:id")
	Optional<Employee>getEmpById(Integer id);
    //6.
	/*@Query("SELECT e from Employee e where where e.eName=:name")
	List<Employee>getEmployeeByName(String name);
	//7.
	@Query("Select e from Employee e where e.eName=:name OR e.eSal>=:sal")
	List<Employee>getEmployeeByNameAndCost(String name,Integer sal);
	//8
	@Query("Select e from Employee e where e.eId in(:inputs)")
	List<Employee>fetchAllEmployeeByIds(List<Integer>inputes);
	//List<Employee>fetchIdAndNames()*/
}
