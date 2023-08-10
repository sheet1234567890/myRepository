package com.adda.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Tag;
import com.adda.app.Reposataryy.IRTagRepo;
import com.adda.app.Service.ITagService;
@Service
public class TagServiceImpl implements ITagService {
    /** Tag Reposatary*/
	@Autowired
	private IRTagRepo trepo;
	@Override
	/**Create Tag...*/
	public Tag CreateTag(Tag tag) {
		
		return trepo.save(tag);
	}

}
