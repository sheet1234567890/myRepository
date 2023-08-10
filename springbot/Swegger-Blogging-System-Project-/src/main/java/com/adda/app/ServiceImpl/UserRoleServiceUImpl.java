package com.adda.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Role;
import com.adda.app.Entity.UserRole;
import com.adda.app.Exceptions.UserRoleAlreadyExistException;
import com.adda.app.Reposataryy.IRUserRoleRepo;
import com.adda.app.Service.IUserRoleService;
@Service
public class UserRoleServiceUImpl implements IUserRoleService {
    @Autowired
	private IRUserRoleRepo urRepo;
	
	@Override
	public UserRole createUserRole(UserRole Urole) {
		
		Integer id = urRepo.getUserIdWhoAlreadyExistOneRole(Urole.getUser().getUid());
		Role role = urRepo.getUserRolewhichRoleThisUser(Urole.getUser().getUid());
		System.out.println(role+"**********");
		if(id==null) {
		return urRepo.save(Urole);
		}
		else 
		{
			throw new UserRoleAlreadyExistException("This user Role is  already "+role+".....");
		}
	}

}
