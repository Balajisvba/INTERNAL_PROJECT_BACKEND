package com.tvm.internal.tvm_internal_project.serviceImpl;

import com.tvm.internal.tvm_internal_project.exception.TimeSheetNotFoundException;
import com.tvm.internal.tvm_internal_project.model.Timesheet;
import com.tvm.internal.tvm_internal_project.repo.TimesheetRepository;
import com.tvm.internal.tvm_internal_project.response.ResponseStructure;
import com.tvm.internal.tvm_internal_project.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimesheetServiceImpl implements TimesheetService {


    @Autowired
    private TimesheetRepository timesheetRepository;

    public ResponseEntity<ResponseStructure<List<Timesheet>>> getAllTimesheets() {
        List<Timesheet> timesheets = timesheetRepository.findAll();
        ResponseStructure<List<Timesheet>> timesheetDto = new ResponseStructure<>();
        timesheetDto.setBody(timesheets);
        timesheetDto.setMessage("List of Timesheet");
        timesheetDto.setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(timesheetDto, HttpStatus.CREATED);
    }

    public ResponseEntity<ResponseStructure<Timesheet>> getTimesheetById(Long id) {
        Optional<Timesheet> optional = timesheetRepository.findById(id);
        if (optional.isEmpty()) {
            throw new TimeSheetNotFoundException("TImesheet Id is Not Found");
        }
        ResponseStructure<Timesheet> timesheetDto = new ResponseStructure<>();
        timesheetDto.setBody(optional.get());
        timesheetDto.setMessage("TimeSheet Fetch Successfully");
        timesheetDto.setStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<>(timesheetDto, HttpStatus.OK);
    }

    public ResponseEntity<ResponseStructure<Timesheet>> createTimesheet(Timesheet timesheet) {
        Timesheet saved = timesheetRepository.save(timesheet);
        ResponseStructure<Timesheet> timesheetDto = new ResponseStructure<>();
        timesheetDto.setBody(saved);
        timesheetDto.setMessage("Timesheet Saved Successfully");
        timesheetDto.setStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<>(timesheetDto, HttpStatus.OK);

    }

    public ResponseEntity<ResponseStructure<Timesheet>> updateTimesheet(Long id, Timesheet timesheetDetails) {
        Optional<Timesheet> optional = timesheetRepository.findById(id);
        if (optional.isEmpty()) {
            throw new TimeSheetNotFoundException("Timesheet Id is Not Found");
        }
        Timesheet timesheet = optional.get();
        timesheet.setEmpId(timesheetDetails.getEmpId());
        timesheet.setDescription(timesheetDetails.getDescription());
        timesheet.setProjectId(timesheetDetails.getProjectId());
        timesheet.setDate(timesheetDetails.getDate());
        timesheet.setHoursworked(timesheetDetails.getHoursworked());
        ResponseStructure<Timesheet> timesheetDto = new ResponseStructure<>();
        timesheetDto.setBody(timesheetRepository.save(timesheet));
        timesheetDto.setMessage("Timesheet is Updated Successfully");
        timesheetDto.setStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<>(timesheetDto, HttpStatus.OK);
    }

    public ResponseEntity<ResponseStructure<String>> deleteTimesheet(Long id) {
        Optional<Timesheet> optional = timesheetRepository.findById(id);
        if (optional.isEmpty()) {
            throw new TimeSheetNotFoundException("TimeSheet Id Is Not Found");
        }
        ResponseStructure<String> timesheetDto = new ResponseStructure<>();
        timesheetDto.setBody("TimeSheet Deleted Successfully");
        timesheetDto.setMessage("Sucess");
        timesheetDto.setStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<>(timesheetDto, HttpStatus.OK);
    }
}



