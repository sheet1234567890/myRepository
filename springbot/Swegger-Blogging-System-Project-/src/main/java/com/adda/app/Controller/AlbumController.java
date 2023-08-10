package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Album;
import com.adda.app.Entity.Photos;
import com.adda.app.Service.IAlbumService;

@RestController
@RequestMapping("/api/album")
public class AlbumController {
	
	/**Create Album..*/
	@Autowired
	private IAlbumService aservice;
	/**Create Album*/
	@PostMapping("/create")
	public ResponseEntity<Album>createAlbum(@RequestBody Album album)
	{
		System.out.println(album);
		return new ResponseEntity<Album>(aservice.CreateAlbum(album),HttpStatus.CREATED);
	}
	/**Get Album By Id*/
	@GetMapping("/getAlbumById/{id}")
	public ResponseEntity<Album>getAlbumById(@PathVariable("id")Integer id)
	{
		return new ResponseEntity<Album>(aservice.getAlbumById(id),HttpStatus.OK);
	}
	/**Get All Album....*/
	@GetMapping("/getAllAlbum")
	public ResponseEntity<List<Album>>getAllAlbum()
	{
		return new ResponseEntity<List<Album>>(aservice.getAllAlbum(),HttpStatus.OK);
	}
	/**Get All Photo In Album..*/
	@GetMapping("/getAllPhotoInAlbum/{aid}")
	public ResponseEntity<List<Photos>>getAllPhotoInAlbum(@PathVariable("aid")Integer id)
	{
		
		return new ResponseEntity<List<Photos>>(aservice.getPhotoByAlbumId(id),HttpStatus.OK);
	}
	/**Delete Album By Id*/
	@DeleteMapping("/albumDelete/{id}")
	public ResponseEntity<String>deleteAlbumByID(@PathVariable("id")Integer id)
	{
		return new ResponseEntity<String>(aservice.DeleteAlbumById(id),HttpStatus.OK);
	}

}
