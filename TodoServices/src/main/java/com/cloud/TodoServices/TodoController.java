package com.cloud.TodoServices;

import com.cloud.TodoServices.dto.TodoRequest;
import com.cloud.TodoServices.model.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;
//
//    @GetMapping("/{todoId}")
//    public ResponseEntity<TodoEntity> getTodoListByTodoID(@PathVariable("todoId") String todoId) {
////        TodoEntity todo = todoBean.getTodoByID(todoId);
//        return ResponseEntity.status(HttpStatus.OK).body(todoEntity);
//    }
//
    @GetMapping("")
    public ResponseEntity<List<TodoEntity>> getAllTodos() {
        List<TodoEntity> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    @PostMapping("")
    public ResponseEntity<TodoEntity> postTodo(@RequestBody TodoRequest todoRequest) {
        TodoEntity createdTodo = todoService.createTodo(todoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTodo);
    }
}
