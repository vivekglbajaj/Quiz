package com.todo.Todo.service;

import com.todo.Todo.entity.Task;
import com.todo.Todo.repo.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {
    private  final TaskRepo taskRepo;
    public TaskService(TaskRepo taskRepo){
        this.taskRepo = taskRepo;

    }
    public  List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    public void createTask(String title) {
         Task tast = new Task();
         tast.setTitle(title);
         tast.setComplete(false);
         taskRepo.save(tast);

    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
                task.setComplete(!task.getComplete());
        taskRepo.save(task);
    }
}
