package com.adda.app.Reposataryy;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Photos;

public interface IRPhotoRepo extends JpaRepository<Photos, Integer> {

	@Query("Select p.album.albumid from Photos p where p.photoid=:id")
	public Integer getAlbumIdByPhoto(Integer id);
    @Query("Select p from Photos p where p.album.albumid=:albumid")
	public List<Photos> getAllPhotosInAlbum(Integer albumid);
    /**get Photos By Photo Name..*/
    public Optional<Photos>findByPhototitle(String Name);
}
