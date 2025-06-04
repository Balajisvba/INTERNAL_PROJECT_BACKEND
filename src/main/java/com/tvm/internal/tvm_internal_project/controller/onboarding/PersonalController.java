package com.tvm.internal.tvm_internal_project.controller.onboarding;

import com.tvm.internal.tvm_internal_project.model.Employee;
import com.tvm.internal.tvm_internal_project.model.onboarding.Personal;
import com.tvm.internal.tvm_internal_project.response.ResponseStructure;
import com.tvm.internal.tvm_internal_project.service.onboarding.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personal")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalController {
    @Autowired
    private PersonalService personalService;

    @PostMapping("{id}")
    public ResponseEntity<ResponseStructure<Personal>> savePersonalInfo(@RequestBody Personal personal, @PathVariable int id) {
        return personalService.savePersonalInfo(personal, id);
    }

    @GetMapping("/onboardedEmp")
    public ResponseEntity<ResponseStructure<List<Personal>>> getsuccessEmployees() {
        return personalService.findSuccessEmployees();
    }

    @GetMapping("/pendingEmp")
    public ResponseEntity<ResponseStructure<List<Employee>>> getFailedEmployees() {
        return personalService.findFailedEmployees();
    }

    @GetMapping("/searchByName/{name}")
    public ResponseEntity<ResponseStructure<List<Personal>>> serachDetailsByName(@PathVariable String name) {
        return personalService.findAllDetailsUsingName(name);
    }

    @GetMapping("/searchByCity/{city}")
    public ResponseEntity<ResponseStructure<List<Personal>>> serachDetailsByCity(@PathVariable String city) {
        return personalService.findAllDetailsUsingCity(city);
    }

    @GetMapping("/searchByContact/{contact}")
    public ResponseEntity<ResponseStructure<Personal>> serachDetailsByContact(@PathVariable Long contact) {
        return personalService.findAllDetailsUsingPhone(contact);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseStructure<Personal>> findById(@PathVariable Integer id) {
        return personalService.findById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<ResponseStructure<Personal>> updateById(@RequestBody Personal personal, @PathVariable Integer id) {
        return personalService.updatePersonal(personal, id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ResponseStructure<String>> deleteById(@PathVariable Integer id) {
        return personalService.deleteById(id);
    }

    @GetMapping("/findAll")
    public ResponseEntity<ResponseStructure<List<Personal>>> findAllSkills() {
        return personalService.findAllPersonal();
    }

}
