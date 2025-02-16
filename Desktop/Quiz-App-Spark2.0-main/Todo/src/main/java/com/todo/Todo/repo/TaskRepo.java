package com.todo.Todo.repo;

import com.todo.Todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {


}
