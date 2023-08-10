package com.adda.app.ServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.Album;
import com.adda.app.Entity.Photos;
import com.adda.app.Exceptions.AlbumNotFoundException;
import com.adda.app.Exceptions.PhotoNotFoundException;
import com.adda.app.Reposataryy.IRAlbumRepo;
import com.adda.app.Reposataryy.IRPhotoRepo;
import com.adda.app.Service.IPhotoService;
import com.adda.app.Util.ImageUtil;

@Service
public class PhotosServiceImpl implements IPhotoService {

	/** Photo repository.. */
	@Autowired
	private IRPhotoRepo prepo;
	/** Album Repository */
	@Autowired
	private IRAlbumRepo arepo;

	@Override
	/** Create Photo Add Album Login User */
	public Photos CreatePhoto(Photos photo) {
		Integer id = arepo.getAlbumById(photo.getAlbum().getAlbumid());
		if (id != null) {
			return prepo.save(photo);
		} else {
			/** if Album not present so throw Exception */
			throw new AlbumNotFoundException("This Album Not found.. Add Photo another Album ");
		}

	}

	/** get Photo By id..... */
	@Override
	public Photos getPhotoById(Integer id) {
		Optional<Photos> p = prepo.findById(id);
		if (p.isPresent()) {
			return p.get();
		} else {
			/** if Photo not present */
			throw new PhotoNotFoundException("Photo Not Found...");
		}
	}

	/** Get All Photos.. */
	@Override
	public List<Photos> getAllPhotos() {
		List<Photos> plist = prepo.findAll();

		return plist;
	}

	@Override
	public String deletePhotoById(Integer id) {

		Optional<Photos> p = prepo.findById(id);
		if (p.isPresent()) {
			prepo.delete(p.get());
			return "photo delete Successfull";
		} else {
			/** if Photo not present */
			throw new PhotoNotFoundException("Photo Not Found...");
		}
	}

	/**upload Image....
	 * @throws IOException */
	@Override
	public String uploadImage(MultipartFile file, Integer id) throws IOException {
		byte [] compress = ImageUtil.compressPhoto(file.getBytes());
		Photos photo = new Photos();
		Album album = new Album();
		album.setAlbumid(id);
		photo.setAlbum(album);
		photo.setPhototitle(file.getOriginalFilename());
		photo.setImageData(compress);
		photo.setType(file.getContentType());
		photo=prepo.save(photo);
	    if(photo!=null) 
	    {
	    	return "Successfully.....:"+file.getOriginalFilename();
	    }
		return null;
	}

	/**DownLoad Image.....*/
	@Override
	public byte[] downloadImage(String file) {
		
		Optional<Photos>dbPhoto =prepo.findByPhototitle(file);
		System.out.println(dbPhoto.get().getImageData().length);
		byte[] image = ImageUtil.decompressImage(dbPhoto.get().getImageData());
		return image;
	}
}
