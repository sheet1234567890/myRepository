package com.adda.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.GroupVarient;
import com.adda.app.Reposataryy.GroupVarientRepo;
import com.adda.app.Service.GroupVarientService;
@Service
public class GroupVarientServiceImpl implements GroupVarientService {
    @Autowired
	private GroupVarientRepo gvr;
	@Override
	public GroupVarient createvarient(GroupVarient gv) {
		
		return gvr.save(gv);
	}

}
