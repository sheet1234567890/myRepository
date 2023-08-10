package com.adda.app.Service;

import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.ImageEntity;

public interface ImageService {

	public ImageEntity crete(ImageEntity i,MultipartFile file);
}
