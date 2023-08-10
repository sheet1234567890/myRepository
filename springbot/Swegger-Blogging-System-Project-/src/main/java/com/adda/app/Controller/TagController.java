package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Tag;
import com.adda.app.Service.ITagService;

@RestController
@RequestMapping("/api/tag")
public class TagController {
    @Autowired
	private ITagService tservice;
    
    /**Create Tag*/
    @PostMapping("/create")
    public ResponseEntity<Tag>CreateTag(@RequestBody Tag tag)
    {
    	return new ResponseEntity<Tag>(tservice.CreateTag(tag),HttpStatus.OK);
    }
}
