package com.cloud.TodoServices;

import com.cloud.TodoServices.dto.TodoRequest;
import com.cloud.TodoServices.model.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    public TodoEntity createTodo(TodoRequest todoRequest) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setUserid(todoRequest.getUserid());
        todoEntity.setTitle(todoRequest.getTitle());
        todoEntity.setDescription(todoRequest.getDescription());
        todoEntity.setIsdone(false);

        TodoEntity result = todoRepository.save(todoEntity);
        System.out.println("Todo "+result.getTodoid()+" is saved");

        return result;
    }

    public List<TodoEntity> getAllTodos() {
        List<TodoEntity> todos = todoRepository.findAll();
        System.out.println("All Todos fetched");

        return todos;
    }

}
