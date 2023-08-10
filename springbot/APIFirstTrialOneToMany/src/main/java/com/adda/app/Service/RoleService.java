package com.adda.app.Service;

import java.util.List;

import com.adda.app.Bean.Role;

public interface RoleService {

public Role createrole(Role role);
public String deleteRole(Integer id);
public String updateRole(Role role);
public List<Role>viewAll();
public String deleteAll();
}
