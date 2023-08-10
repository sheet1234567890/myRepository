package com.adda.app.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Service.StorageService;

@RequestMapping("/image")
@RestController
public class StorageController {
	@Autowired
	private StorageService service;
	
	@PostMapping("/uploadImage")
	public ResponseEntity<?>uploadImage(@RequestParam("image")MultipartFile file) throws IOException
	{
		String uploadimage = service.uploadImage(file);
		return ResponseEntity.status(HttpStatus.OK).body(uploadimage);
				
	}
	@GetMapping("/getImagae/{filename}")
	public ResponseEntity<?> downloadImage(@PathVariable("filename") String filename)
	{
		byte[]imageData = service.downloadImage(filename);
		System.out.println("sheetal");
		System.out.println(imageData.length);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imageData);
	}
																																										
}
																																											