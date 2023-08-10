package com.adda.app.Service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.ImageData;
import com.adda.app.reposatary.StorageRepo;
import com.adda.app.util.imageUtil;

@Service
public class StorageService {
	@Autowired
	private StorageRepo Srepo;

	
	public String uploadImage(MultipartFile file) throws IOException 
	{
		byte[] compressImage = imageUtil.compressImage(file.getBytes());
		ImageData imagedata  = new ImageData();
		imagedata.setName(file.getOriginalFilename());
		imagedata.setImageData(compressImage);
		imagedata.setType(file.getContentType());
		imagedata = Srepo.save(imagedata) ;

		if(imagedata!=null) 
		{
			return "Successfully.....:"+file.getOriginalFilename();
		}
		return null;
	}
	
	public byte[] downloadImage(String file)
	{
		Optional<ImageData>dbimagedata= Srepo.findByName(file);
		System.out.println(dbimagedata.get().getImageData().length);
		byte[]image = imageUtil.decompressImage(dbimagedata.get().getImageData());
		return image;
	}
}
