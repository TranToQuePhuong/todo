package com.green.todomana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.todomana.dao.todoMDAO;
import com.green.todomana.entity.todoM;

@Service
public class todoMService {
	@Autowired
	todoMDAO todoMDAO;
	
	public List<todoM> findAll()
	{
		return todoMDAO.findAll();
	}
	
	public todoM createTodoM(todoM todo) {
		todoM result = todoMDAO.create(todo);
		return result;
	}
	
	public todoM findTodoM(int id) {
		return todoMDAO.find(id);
	}
	
	public todoM updateTodoM(todoM todo) {
		todoM result = todoMDAO.update(todo);
		return result;
	}
	
	public todoM deleteTodoM(todoM todo) {
		todoM result = todoMDAO.delete(todo);
		return result;
	}
	
}
