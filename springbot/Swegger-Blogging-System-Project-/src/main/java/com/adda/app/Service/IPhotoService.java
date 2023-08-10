package com.adda.app.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.Photos;

public interface IPhotoService {

	/**Create Photo*/
	public Photos CreatePhoto(Photos photo);
	/**get Photo By Id*/
	public Photos getPhotoById(Integer id);
	/**Get All Photos*/
	public List<Photos>getAllPhotos();
	/**Delete Photo By Id*/
	public String deletePhotoById(Integer id);
	/**Upload Photo
	 * @throws IOException */
	public String uploadImage(MultipartFile file,Integer id) throws IOException;
	/**Download Photo..by Photo Name*/
	public byte[] downloadImage(String file);
}
