package com.adda.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Todos;
import com.adda.app.Exceptions.TodosNotFound;
import com.adda.app.Reposataryy.IRTodoRepo;
import com.adda.app.Service.ITodoService;
@Service
public class TodosServiceImpl implements ITodoService {
/** Todo Reposatary..*/
	@Autowired
	private IRTodoRepo trepo;
	@Override
	
	/**get Todo  By Id*/
	public Todos getTodosById(Integer id) {
		Optional<Todos>todos = trepo.findById(id);
		if(todos.isEmpty()) 
		{
			throw new TodosNotFound("todo List Not Found");
		}
		else 
		{
			return todos.get();
		}
		
	}

	/**Get All TOdos...*/
	@Override
	public List<Todos> getAllTOdo() {
		
		return trepo.findAll();
	}

	/**Delete Todos By Id*/
	@Override
	public String DeleteTodoById(Integer id) {
		Optional<Todos>opt = trepo.findById(id);
		if(opt.isEmpty()) 
		{
			throw new TodosNotFound("Todo Not Found");
		}
		else 
		{
			trepo.delete(opt.get());
			return "todo delete successfull...!";
		}
		
	}

	/**todo update list complete or not*/
	@Override
	public String updateTodoById(Boolean b,Integer id) {
		if(trepo.existsById(id)) {
		Integer id1 =trepo.updateTodoisCompletorNotComplit(b, id);
		if(b==true&&id1==1) 
		{
			return "Todo List is Complete ";
		}
		else 
		{
			return "Todo List is Uncompleted...";		
			
		}
		}
		else
		{
			throw new TodosNotFound("Todo Not Found ");
		
		}
		
		
		
	}

}
