package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Album;

public interface IRAlbumRepo extends JpaRepository<Album, Integer> {

	/**get Album By albumname*/
	@Query("select a.albumid from Album a where a.albumtitle=:name")
	public Integer getAlbumByNamee(String name) ;
	
	
	/**get Album By Id*/
	@Query("Select a.albumid from Album a where a.albumid=:id")
	public Integer getAlbumById(Integer id);
	
}
