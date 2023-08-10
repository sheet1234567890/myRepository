package com.adda.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.ImageEntity;
import com.adda.app.Reposataryy.ImageRepo;
import com.adda.app.Service.ImageService;

public class ImageServiceImpl implements ImageService{
    @Autowired
	private ImageRepo i1;
	@Override
	public ImageEntity crete(ImageEntity i, MultipartFile file) {
		
		return i1.save(i);
	}

}
