package com.tvm.internal.tvm_internal_project.serviceImpl;

import com.tvm.internal.tvm_internal_project.model.Timesheet;
import com.tvm.internal.tvm_internal_project.repo.TimesheetRepository;
import com.tvm.internal.tvm_internal_project.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesheetServiceImpl implements TimesheetService {


    @Autowired
    private TimesheetRepository timesheetRepository;

    public List<Timesheet> getAllTimesheets() {
        return timesheetRepository.findAll();
    }

    public Timesheet getTimesheetById(Long id) {
        return timesheetRepository.findById(id).orElse(null);
    }

    public String createTimesheet(Timesheet timesheet) {
        if (timesheet != null) {
            Timesheet ts = timesheetRepository.save(timesheet);
            return "success";
        } else {
            return "Unsuccessfull" + timesheet;
        }

    }

    public Timesheet updateTimesheet(Long id, Timesheet timesheetDetails) {
        Timesheet timesheet = getTimesheetById(id);
        timesheet.setEmpId(timesheetDetails.getEmpId());
        timesheet.setDescription(timesheetDetails.getDescription());
        timesheet.setProjectId(timesheetDetails.getProjectId());
        timesheet.setDate(timesheetDetails.getDate());
        timesheet.setHoursworked(timesheetDetails.getHoursworked());
        return timesheetRepository.save(timesheet);
    }

    public void deleteTimesheet(Long id) {
        timesheetRepository.deleteById(id);
    }
}



