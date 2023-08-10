package com.adda.app.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Todos;
import com.adda.app.Service.ITodoService;
import com.adda.app.Service.IUserService;

@RequestMapping("/api/todos")
@RestController
public class TodosController {
	/**Todo Service*/
    @Autowired
	private ITodoService tservice;
    @Autowired
    private IUserService uservice;
    
    /**  Create Todos By User */
	@PostMapping("/create")
	public ResponseEntity<Todos> CreateTodos(@RequestBody Todos todos,Principal p) {
		return new ResponseEntity<Todos>(uservice.CreateTodos(todos,p), HttpStatus.OK);

	}
	/**get Todo By id*/
    @GetMapping("/{id}")
	public ResponseEntity<Todos>getTodosById(@PathVariable("id") Integer id)
	{
		return  new ResponseEntity<Todos>(tservice.getTodosById(id),HttpStatus.OK);
	}
    /**get All TOdos...*/
    @GetMapping("")
    public ResponseEntity<List<Todos>>getAllTodos()
	{
		return  new ResponseEntity<List<Todos>>(tservice.getAllTOdo(),HttpStatus.OK);
	}
    /**Delete Todos By Id*/
    @DeleteMapping("/deletetodo/{id}")
    public ResponseEntity<String>DeleteTodosById(@PathVariable("id")Integer id)
    {
    	return new ResponseEntity<String>(tservice.DeleteTodoById(id),HttpStatus.OK);
    }
    
    /**Update Todo Complete or Not Complete*/
    @PutMapping("/updatetodoDoneOrNot/{b}/{id}")
    public ResponseEntity<String> updateTOdoisCompleteorNotCOmplete(@PathVariable("b")Boolean b,@PathVariable("id")Integer id)
    {
    	System.out.println(b+" "+id);
    	return new ResponseEntity<String> (tservice.updateTodoById(b, id),HttpStatus.OK);
    }
}
