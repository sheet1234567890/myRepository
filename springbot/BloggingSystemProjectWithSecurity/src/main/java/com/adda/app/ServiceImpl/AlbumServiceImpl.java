package com.adda.app.ServiceImpl;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Album;
import com.adda.app.Entity.Photos;
import com.adda.app.Entity.User;
import com.adda.app.Exceptions.AlbumNotFoundException;
import com.adda.app.Exceptions.UserNotFoundException;
import com.adda.app.Reposataryy.IRAlbumRepo;
import com.adda.app.Reposataryy.IRPhotoRepo;
import com.adda.app.Reposataryy.IRUserRepo;
import com.adda.app.Service.IAlbumService;
@Service
public class AlbumServiceImpl implements IAlbumService {
	/**Album Repository*/
    @Autowired
	private IRAlbumRepo arepo;
    /**Photo Repository*/
    @Autowired
	private IRPhotoRepo prepo;
    /**User Repository..*/
    @Autowired
    private IRUserRepo urepo;
	
    /**Create Album....*/
	@Override
	public Album CreateAlbum(Album album,Principal p) {
		User u=urepo.getUserByUserName(p.getName());
		album.setUser(u);
		Integer id = arepo.getAlbumByNamee(album.getAlbumtitle());
		if(urepo.getUserbyUserId(album.getUser().getUid())==null) 
		{
			throw new UserNotFoundException("User Not Available..");
		}
		else if(id!=null) {
		
		throw new AlbumNotFoundException("Album Already Exists..");
		
		}
		else 
		{
			return arepo.save(album);
		}
	}
  /**Get Album By Id*/
	@Override
	public Album getAlbumById(Integer id) {
		Optional<Album> a = arepo.findById(id);
		if(a.isPresent()) 
		{
			return a.get();
		}
		else 
		{
			throw new AlbumNotFoundException("Album Not Found");
		}
	}
  /**Get All Album....*/
	@Override
	public List<Album> getAllAlbum() {
		return arepo.findAll();
	}
	/**Get All Photos In Album*/
@Override
public List<Photos> getPhotoByAlbumId(Integer id) {
	Optional<Album> a = arepo.findById(id);
	if(a.isEmpty()) 
	{
		throw new AlbumNotFoundException("Album Not Found");
	}
	else 
	 return  prepo.getAllPhotosInAlbum(a.get().getAlbumid());
	
}

   /**Delete Album By id*/
	@Override
	public String DeleteAlbumById(Integer id) {
		
		Optional<Album>album = arepo.findById(id);
		if(album.isPresent()) 
		{
			arepo.delete(album.get());
			return "Album delete SuccessFull....";
			
		}
		
		else 
		{
			throw new AlbumNotFoundException("Album Not FOund");
		}

	}
}
