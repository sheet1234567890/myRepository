package com.adda.app.Service;

import java.security.Principal;
import java.util.List;

import com.adda.app.Entity.Album;
import com.adda.app.Entity.Photos;

public interface IAlbumService {
  /** Create Album  */
	public Album CreateAlbum(Album album,Principal p);
	/**get Album By Id*/
	public Album getAlbumById(Integer id);
	/**get All Album*/
	public List<Album>getAllAlbum();
	/**get All Photo in Album */
	public List<Photos>getPhotoByAlbumId(Integer id);
	/**Delete Album By Id*/
	public String DeleteAlbumById(Integer id);
}
