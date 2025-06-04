package com.tvm.internal.tvm_internal_project.service;

import com.tvm.internal.tvm_internal_project.model.Timesheet;

import java.util.List;

public interface TimesheetService {


    List<Timesheet> getAllTimesheets();

    Timesheet getTimesheetById(Long id);

    String createTimesheet(Timesheet timesheet);

    Timesheet updateTimesheet(Long id, Timesheet timesheetDetails);

    void deleteTimesheet(Long id);

}


