package com.tvm.internal.tvm_internal_project.service;

import com.tvm.internal.tvm_internal_project.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task updateTask(Long id, Task taskDetails);

    void deleteTask(Long id);

}

