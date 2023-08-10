package com.adda.app.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.Photos;
import com.adda.app.Service.IPhotoService;

@RequestMapping("/api/photo")
@RestController
public class PhotoController {
    @Autowired
	private IPhotoService pService;
    
   
	/**get Photo By Id*/
	@GetMapping("/{id}")
	public ResponseEntity<Photos>getPhotobyId(@PathVariable("id")Integer id)
	{
		return new ResponseEntity<Photos>(pService.getPhotoById(id),HttpStatus.OK);
	}
	/**Get all Photos*/
	@GetMapping("")
	public ResponseEntity<List<Photos>>getAllPhotos(){
	  return new ResponseEntity<List<Photos>>(pService.getAllPhotos(),HttpStatus.OK);	
	}
	/**Delete Photo By Id*/
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deletePhotoById(@PathVariable("id")Integer id)
	{
	 return new ResponseEntity<String>(pService.deletePhotoById(id),HttpStatus.OK);	
	}
	/**Create Photo*/
	@PostMapping("/uploadImage/{id}")
	public ResponseEntity<?>uploadImage(@RequestParam("image")MultipartFile file,@PathVariable("id")Integer id) throws IOException
	{
		String uploadimage = pService.uploadImage(file,id);
		return ResponseEntity.status(HttpStatus.OK).body(uploadimage);
				
	}
	/**Show photo by file name....*/
	@GetMapping("/getImage/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable("filename") String filename)
	{
		byte[]imageData = pService.downloadImage(filename);
		System.out.println("sheetal");
		System.out.println(imageData.length);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imageData);
	}
}
