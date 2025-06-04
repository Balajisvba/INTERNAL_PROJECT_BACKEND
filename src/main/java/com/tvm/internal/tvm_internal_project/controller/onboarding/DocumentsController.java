package com.tvm.internal.tvm_internal_project.controller.onboarding;

import com.tvm.internal.tvm_internal_project.model.onboarding.Documents;
import com.tvm.internal.tvm_internal_project.service.onboarding.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("documents")
public class DocumentsController {
    @Autowired
    private DocumentsService documentsService;

    @PostMapping
    public String saveDocument(Documents documents) {
        return "This Is Documents...";
    }
}