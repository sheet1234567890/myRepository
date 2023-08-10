package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.GroupVarient;
import com.adda.app.Entity.ProductGroup;
import com.adda.app.Service.ProductGroupService;
@RequestMapping("/productGroup")
@RestController
public class ProductGroupController {
   @Autowired
	private ProductGroupService pgservice;
	
   @PostMapping("/createProductGroup")
   public ResponseEntity<ProductGroup>saveProductGroup(@RequestBody ProductGroup pg)
   {
	  // System.out.println(pg);
	   return new ResponseEntity<ProductGroup>(pgservice.saveProductGroup(pg),HttpStatus.CREATED);
   }
   
   @GetMapping("/ListOfGroup")
   public ResponseEntity <List<ProductGroup>>listOfGroup()
   {
	 return new ResponseEntity<List<ProductGroup>>(pgservice.listOfGroup(),HttpStatus.OK);
   }
   
   @GetMapping("/GroupById/{id}")
   public ResponseEntity<ProductGroup>GroupById(@PathVariable("id") Integer id)
   {
	   return new ResponseEntity<ProductGroup>(pgservice.GroupById(id),HttpStatus.OK);
   }
   @PostMapping("/updateGroupById/{id}")
   public ResponseEntity<ProductGroup>updateGroupById(@PathVariable("id")Integer id,@RequestBody ProductGroup pg)
   {
	   pg.setPgid(id);
	  // ProductGroup pg1 = this.pgservice.updateGroup(id, pg);
	   ProductGroup pg1 = this.pgservice.GroupById(id);
	   pg1.setPgname(pg.getPgname());
	   List <GroupVarient> gvlist = pg1.getGvlist();
	   pg.getGvlist().forEach(g->{
		   gvlist.add(g);
	   });
	   return new ResponseEntity<ProductGroup>(this.pgservice.saveProductGroup(pg1),HttpStatus.OK);
   }
}
