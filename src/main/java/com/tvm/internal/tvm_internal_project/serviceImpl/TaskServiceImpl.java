package com.tvm.internal.tvm_internal_project.serviceImpl;

import com.tvm.internal.tvm_internal_project.model.Task;
import com.tvm.internal.tvm_internal_project.repo.TaskRepo;
import com.tvm.internal.tvm_internal_project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    private TaskRepo taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

//    private Long id;
//    private String taskName;
//    private String taskOwner;
//    private String description;
//    private String priority;
//    private LocalDate assignedDate;
//    private LocalDate dueDate;
//    private String status;
//    private Date reminder;

    public Task updateTask(Long id, Task taskDetails) {

        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));


        task.setTaskName(taskDetails.getTaskName());
        task.setTaskOwner(taskDetails.getTaskOwner());
        task.setDescription(taskDetails.getDescription());
        task.setPriority(taskDetails.getPriority());
        task.setAssignedDate(taskDetails.getAssignedDate());
        task.setDueDate(taskDetails.getDueDate());
        task.setStatus(taskDetails.getStatus());
        task.setReminder(taskDetails.getReminder());
        return taskRepository.save(task);

    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


//    public List<Task> getTasksByEmployee(int empId) {
//        return taskRepository.findByEmployeeId(empId);
//    }
}
