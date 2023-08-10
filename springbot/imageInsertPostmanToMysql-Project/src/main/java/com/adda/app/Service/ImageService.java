package com.adda.app.Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.IEntity.ImageData;
import com.adda.app.Reposatary.StorageRepository;

public class ImageService {
    
	 @Autowired
	    private StorageRepository repository;
	
	 public String uploadImage(MultipartFile file) throws IOException {

	        ImageData imageData = repository.save(ImageData.builder()
	                .name(file.getOriginalFilename())
	                .type(file.getContentType())
	                .imageData(ImageUtils.compressImage(file.getBytes())).build());
	        if (imageData != null) {
	            return "file uploaded successfully : " + file.getOriginalFilename();
	        }
	        return null;
	    }
}
