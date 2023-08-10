package com.adda.app.Service;

import java.util.List;
import java.util.Optional;

import com.adda.app.Entity.Todos;

public interface ITodoService {
	/**get Todo  By Id*/
	public Todos getTodosById(Integer id);
	/**Get All TOdos...*/
	public List<Todos>getAllTOdo();
	/**Delete Todo by id*/
	public String DeleteTodoById(Integer id);
	/**Put Todo todo complete or not complete*/
	public String updateTodoById(Boolean b,Integer id);
}
