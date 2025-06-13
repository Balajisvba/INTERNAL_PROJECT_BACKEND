package com.tvm.internal.tvm_internal_project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Date")
    private Date date;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "OfficeHours")
    private String officeHours;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "SystemHours")
    private String systemHours;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "Total")
    private String total;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "Break")
    private String breakTime;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "Working")
    private String workingTime;
    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getSystemHours() {
        return systemHours;
    }

    public void setSystemHours(String systemHours) {
        this.systemHours = systemHours;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(String breakTime) {
        this.breakTime = breakTime;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
