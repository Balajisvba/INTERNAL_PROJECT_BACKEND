package com.tvm.internal.tvm_internal_project.response;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class OffboardingResponseDTO {
    private Long id;
    private Long employeeId;
    private LocalDate noticePeriodStartDate;
    private LocalDate noticePeriodEndDate;
    private LocalDate relievingDate;
    private String exitReason;
    private String exitType;
    private String exitStatus;
    private String exitInterviewFeedback;
    private String exitInterviewer;
    private Boolean offboardingDocumentsSubmitted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
