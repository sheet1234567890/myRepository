package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.adda.app.Entity.ImageEntity;
import com.adda.app.Service.ImageService;

@RequestMapping("/file")
@RestController
public class ImageControlller {
    @Autowired
	private ImageService is;
	@PostMapping("/upload")
	public ResponseEntity<ImageEntity>createimage(@RequestBody ImageEntity ie,@RequestParam("/images") MultipartFile file)
	{
		return new ResponseEntity<ImageEntity>(is.crete(ie, file),HttpStatus.OK);
	}
}
