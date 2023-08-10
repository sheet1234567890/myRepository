package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Role;
import com.adda.app.Entity.UserRole;

public interface IRUserRoleRepo extends JpaRepository<UserRole, Integer> {

	/**Check User Role Exist or Not*/
	@Query("Select u.user.uid from UserRole u where u.user.uid=:id")
	public Integer getUserIdWhoAlreadyExistOneRole(Integer id);
	
	/**Check user Role which role this User*/
	@Query("Select u.roleid from UserRole u where u.user.uid=:id")
	public Role getUserRolewhichRoleThisUser(Integer id);
	
}
